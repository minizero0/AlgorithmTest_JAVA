package Baekjoon.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Pair{
    int height, cnt;

    public Pair(int height, int cnt) {
        this.height = height;
        this.cnt = cnt;
    }
}

public class boj3015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Pair> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        long count = 0;
        for(int i = 0; i < N; i++){
            int top = Integer.parseInt(br.readLine());
            Pair pair = new Pair(top, 1);

            while(!stack.isEmpty() && stack.peek().height <= top){
                Pair p = stack.pop();
                count += p.cnt;
                if(p.height == top) pair.cnt += p.cnt;
            }
            if(!stack.isEmpty()) count++;
            stack.push(pair);
        }
        System.out.println(count);
    }
}
