package BakingDog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_6198 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        long count = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            while(!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }
            // 12 2
            stack.push(num);
            count += stack.size()-1;
        }
        System.out.println(count);
    }
}
