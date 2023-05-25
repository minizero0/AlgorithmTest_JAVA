package BakingDog.sort1;

import java.io.*;
import java.util.Arrays;

public class boj_10989_counting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[10001];

        for(int i = 0; i < N; i++) arr[Integer.parseInt(br.readLine())]++;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > 0) {
                bw.write(i +"\n");
                arr[i--]--;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
