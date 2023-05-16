package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1204 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int res = 0;

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int tc = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[101];
            int max = 0;
            for(int j = 0; j < 1000; j++){
                arr[Integer.parseInt(st.nextToken())]++;
            }

            for(int j = 0; j < 100; j++){
                if(arr[j] >= max) {
                    max = arr[j];
                    res = j;
                }
            }
            System.out.println("#"+tc+" "+res);
        }
    }
}
