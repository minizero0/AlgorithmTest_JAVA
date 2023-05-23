package BakingDog.sort1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a[] = new int[Integer.parseInt(st.nextToken())];
        int b[] = new int[Integer.parseInt(st.nextToken())];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a.length; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b.length; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }


        int c[] = new int[a.length+b.length];


        int a1 = 0, b1 = 0;
        for(int i = 0; i < c.length; i++){
            if(a.length == a1){
                c[i] = b[b1++];
            }else if(b.length == b1){
                c[i] = a[a1++];
            }else if(a[a1] <= b[b1]){
                c[i] = a[a1++];
            }else{
                c[i] = b[b1++];
            }
        }
        for(int i : c){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
