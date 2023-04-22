package BakingDog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_6198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack();
        int n = Integer.parseInt(br.readLine());
        long count = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());

            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            count += stack.size();
            stack.push(num);
        }
        System.out.println(count);
    }
}
