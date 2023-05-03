package BakingDog.recursion;

// 하노이 탑

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11729 {

    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void hanoi(int n, int from, int to, int other){
        if (n == 0 ) return;
        else{
            count++;
            hanoi(n-1, from, other, to);

            sb.append(n + " " + from + " " + to + "\n");

            hanoi(n-1, other, to, from);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        hanoi(n,1,3,2);
        System.out.println(count);
        System.out.println(sb);


    }
}
