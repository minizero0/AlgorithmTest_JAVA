package test.Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj10808 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int arr[] = new int[26];

        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i)-'a']++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
