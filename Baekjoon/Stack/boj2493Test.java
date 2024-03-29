package Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj2493Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<int[]> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= N; i++){
            int top = Integer.parseInt(st.nextToken());

            while(!stack.isEmpty()){
                if(stack.peek()[1] >= top){
                    System.out.println(stack.peek()[1] + " ");
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()) System.out.println("0 ");
            stack.push(new int[] {i, top});
        }
    }
}
