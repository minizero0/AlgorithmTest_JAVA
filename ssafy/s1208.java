package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s1208 {
    static int[] arr = new int[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;
        for(int t = 1; t <= 10; t++){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 0; i < n; i++){
                Arrays.sort(arr);
                if(arr[0] == arr[arr.length-1]) break;
                arr[0]++;
                arr[99]--;
            }
            Arrays.sort(arr);
            sum = arr[99]-arr[0];
            System.out.println("#"+t+" "+sum);

        }
    }
}
