package Baekjoon.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int students = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        //women 0, man 1
        //level 1 ~ 6

        int arr[][] = new int[6][2];
        for(int i = 0; i < students; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken())-1;
            arr[b][a]++;
        }

        int cnt = 0;

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 2; j++){
                if(arr[i][j] == 0) continue;
                else if(arr[i][j] > 0 && arr[i][j] <= k) cnt++;
                else if(arr[i][j] > k){
                    arr[i][j--] -= k;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
