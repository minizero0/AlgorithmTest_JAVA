package Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj3986Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++){
                if(!stack.isEmpty() && stack.peek() == str.charAt(j)) stack.pop();
                else stack.push(str.charAt(j));
            }
            if(stack.isEmpty()) count++;
            else stack.clear();
        }
        System.out.println(count);
    }
}
