package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String command = br.readLine();

        int count = 0;
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);
            if(c == '(') stack.push(c);
            else{
                stack.pop();
                if(command.charAt(i-1) == '('){
                    count += stack.size();
                }else{
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
