package Baekjoon.Stack;

import java.io.*;
import java.util.Stack;

public class boj6198 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Stack<Integer> stack = new Stack<>();
       int N = Integer.parseInt(br.readLine());
       int count = 0;

       for(int i = 0; i < N; i++){
           int n = Integer.parseInt(br.readLine());
           while(!stack.isEmpty() && stack.peek() <= n){
               stack.pop();
           }
           count += stack.size();
           stack.push(n);
       }
        System.out.println(count);
    }
}
