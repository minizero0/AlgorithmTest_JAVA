package saffy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaxVic {
    static String[] arr;
    static int max, chance;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            arr = sc.next().split("");
            chance = sc.nextInt();

            max = 0;
            if(arr.length < chance){
                chance = arr.length;
            }
            dfs(0,0);
            System.out.println("#" + i+1 + " " + max);
        }
    }

    static void dfs(int start, int cnt){
        if(cnt == chance){
            String result = "";
            for(String s : arr) result += s;
            max = Math.max(max, Integer.parseInt(result));
            return;
        }

        for(int i = start; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i, cnt + 1);	// 깊이 +1
                // 다시 swap 해서 되돌림
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

    }
}
