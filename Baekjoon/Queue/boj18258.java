package Baekjoon.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class boj18258 {
    static Deque<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    void push(int n){queue.add(n);}
    public int pop(){
        if(queue.isEmpty()) return -1;
        else return (int)queue.remove();
    }
    public int front(){
        if(queue.isEmpty()) return -1;
        else return (int)queue.peek();
    }
    public int back(){
        if(queue.isEmpty()) return -1;
        else return (int)queue.peekLast();
    }
    public int size(){
        return (int)queue.size();
    }
    public int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        boj18258 b = new boj18258();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();

            if(str.equals("pop")){
                sb.append(b.pop()).append("\n");
            }else if(str.equals("size")){
                sb.append(b.size()).append("\n");
            }else if(str.equals("front")){
                sb.append(b.front()).append("\n");
            }else if(str.equals("back")){
                sb.append(b.back()).append("\n");
            }else if(str.contains("push")){
                b.push(Integer.parseInt(str.substring(5)));
            }else if(str.equals("empty")){
                sb.append(b.empty()).append("\n");
            }
        }
        System.out.println(sb);

    }
}
