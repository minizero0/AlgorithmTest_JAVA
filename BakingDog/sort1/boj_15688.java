package BakingDog.sort1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class boj_15688 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) sb.append(arr[i]).append("\n");

        System.out.println(sb);


    }
}
