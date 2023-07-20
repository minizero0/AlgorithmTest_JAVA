package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj6198Test {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Stack<Integer> stack = new Stack<>();
       int N = Integer.parseInt(br.readLine());

       int count = 0;

       for(int i = 0; i < N ; i++){
           int n = Integer.parseInt(br.readLine());
           while(!stack.isEmpty() && stack.peek() <= n) {
               stack.pop();
           }
           count += stack.size();
           stack.push(n);
       }
        System.out.println(count);
    }
}
