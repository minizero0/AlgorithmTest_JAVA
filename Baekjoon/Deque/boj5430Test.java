package Baekjoon.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class boj5430Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String str = br.readLine();
            LinkedList<Integer> deque = new LinkedList<>();

            for(String a : str.substring(1, str.length()-1).split(",")){
                if(!a.equals("")) deque.add(Integer.parseInt(a));
            }
            System.out.println(AC(deque, command));
        }
    }

    static public String AC(LinkedList<Integer> deque, String command){
        boolean reverse = false;

        for(char c : command.toCharArray()){
            if(c == 'R') reverse = !reverse;
            else{
                if(deque.size() == 0) return "error";
                else{
                    if(reverse) deque.removeLast();
                    else deque.removeFirst();
                }
            }
        }
        StringBuilder sb = new StringBuilder("[");
        while(!deque.isEmpty()){
            sb.append(reverse ? deque.removeLast() : deque.removeFirst());
            if(deque.size() != 0) sb.append(",");
        }
        sb.append("]");
        return sb.toString();

    }
}
