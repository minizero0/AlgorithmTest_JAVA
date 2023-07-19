package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        while(true){
            String str = br.readLine();
            boolean flag = true;
            
            if(str.equals(".")) break;

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '(' || str.charAt(i) == '['){
                    stack.push(str.charAt(i));
                }else if(str.charAt(i) == ')'){
                    if(!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else flag = false;
                }else if(str.charAt(i) == ']'){
                    if(!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else flag = false;
                }
            }
            if(!stack.isEmpty() || !flag) System.out.println("no");
            else System.out.println("yes");
            stack.clear();
        }
    }
}
