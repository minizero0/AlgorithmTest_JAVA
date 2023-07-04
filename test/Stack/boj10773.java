package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(br.readLine());

            if(n > 0){
                stack.push(n);
            }else if(n == 0 && !stack.isEmpty()){
                stack.pop();
            }
        }

        int ans = 0;
        int len = stack.size();
        for(int i = 0; i < len; i++){
            ans += stack.pop();
        }

        System.out.println(ans);
    }
}
