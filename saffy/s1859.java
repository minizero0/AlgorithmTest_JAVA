package saffy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++){
            int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int arr[] = new int[n];

            for(int j = 0; j < n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            int max = arr[n-1];
            long sum = 0;
            for(int j = n-2; j >= 0; j--){
                if(arr[j] > max)
                    max = arr[j];
                else
                    sum += max - arr[j];
            }
            System.out.println("#"+i+" "+sum);

        }
    }
}
