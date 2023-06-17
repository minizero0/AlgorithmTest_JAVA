package test.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int arr[] = new int[10];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-'0']++;
        }

        int k = arr[6] + arr[9];

        if(k % 2 == 0){
            arr[6] = k / 2;
            arr[9] = k / 2;
        }else{
            arr[6] = k / 2 + 1;
            arr[9] = k / 2 + 1;
        }

        int max = 0;

        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}
