package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj2504Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String command = br.readLine();

        int ans = 0;
        int val = 1;
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);

            if(c == '(') {
                stack.push(c);
                val *= 2;
            }else if(c == '['){
                stack.push(c);
                val *= 3;
            }else if(c == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    ans = 0;
                    break;
                }else if(command.charAt(i-1) == '('){
                    ans += val;
                }
                stack.pop();
                val /= 2;
            }else if(c == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    ans = 0;
                    break;
                }else if(command.charAt(i-1) == '['){
                    ans += val;
                }
                stack.pop();
                val /= 3;
            }
        }
        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(ans);
    }
}
