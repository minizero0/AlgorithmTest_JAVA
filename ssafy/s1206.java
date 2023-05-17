package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1206 {
    static int arr[];
    static int dx[] = {-2,-1,1,2};
    static final int T = 10;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            arr = new int[n];
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int res = 0;
            for(int i = 2; i < n-2; i++){
                max = 0;
                for(int j = 0; j < 4; j++){
                    if(arr[i+dx[j]] > max) max = arr[i+dx[j]];
                }
                if(arr[i] > max) res += arr[i] - max;
            }
            System.out.println("#"+t+" "+ res);
        }
    }
}
