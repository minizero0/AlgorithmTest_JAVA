package Baekjoon;

import java.util.Stack;

public class stackTest {

    public static void main(String[] args) {
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < 10; i++){
            stack.push(new int[] {i, i+10});
            System.out.println(stack.peek()[0] + "," + stack.peek()[1]);

        }
    }
}
