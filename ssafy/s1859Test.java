package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1859Test {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = arr[n-1];
            int res = 0;
            for(int i = n-2; i >= 0; i--){
                if(arr[i] > max){
                    max = arr[i];
                }else{
                    res += max - arr[i];
                }
            }
            System.out.println("#"+t+" "+res);
        }
    }
}
