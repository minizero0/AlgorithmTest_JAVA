package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queTest {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        Stack stack = new Stack();
        stack.push(3);
        stack.push(30);
        System.out.println(stack.peek());
    }
}
