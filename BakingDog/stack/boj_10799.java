package BakingDog.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String s = br.readLine();
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') stack.push(s.charAt(i));
            else{
                char top = stack.pop();
                if(s.charAt(i-1) == '('){
                    ans += stack.size();
                }else{
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
