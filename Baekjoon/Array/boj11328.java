package Baekjoon.Array;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int arr1[] = new int[a.length()];
            int arr2[] = new int[b.length()];
            for(int j = 0; j < a.length(); j++){
                arr1[j] = a.charAt(j);
            }
            for(int j = 0; j < b.length(); j++){
                arr2[j] = b.charAt(j);
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String ans = "Possible";

            for(int j = 0; j < arr1.length; j++){
                if(arr1[j] != arr2[j]){
                    ans = "Impossible";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
