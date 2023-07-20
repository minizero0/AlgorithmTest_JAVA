package test.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj1874Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());

        int start = 0;
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());

            if(start < num){
                for(int j = start+1; j <= num; j++){
                    stack.push(j);
                    sb.append("+\n");
                }
                start = num;
            }else if(stack.peek() != num){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}
