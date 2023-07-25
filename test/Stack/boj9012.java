package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            Stack<Character> stack = new Stack<>();
            String command = br.readLine();
            boolean flag = true;

            for(int j = 0; j < command.length(); j++){
                char c = command.charAt(j);
                if(c == '(') stack.push(c);
                else if(!stack.isEmpty() && c == ')') stack.pop();
                else {
                    flag = false;
                    break;
                }
            }
            if(flag && stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");

        }
    }

}
