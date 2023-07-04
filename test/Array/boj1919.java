package test.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int arr[] = new int[26];


        for(int i = 0; i < a.length(); i++) arr[a.charAt(i)-'a']++;
        for(int i = 0; i < b.length(); i++) arr[b.charAt(i)-'a']--;


        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            ans += Math.abs(arr[i]);
        }

        System.out.println(ans);
    }
}
