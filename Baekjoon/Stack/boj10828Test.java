package Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10828Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int start = 0;

        for(int i = 0; i < N; i++){
            int number = Integer.parseInt(br.readLine());

            if(number > start){
                for(int j = start+1; j <= number; j++){
                    stack.push(j);
                    sb.append('+').append('\n');
                }
                start = number;
            }else if(stack.peek() != number){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }

        System.out.println(sb);

    }
}
