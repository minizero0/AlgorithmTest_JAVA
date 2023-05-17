package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s1984 {
    static int arr[] = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < 10; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            double sum = 0;
            for(int i = 1; i < arr.length-1; i++) sum += arr[i];

            System.out.println("#"+t+" "+Math.round(sum/8));

        }
    }
}
