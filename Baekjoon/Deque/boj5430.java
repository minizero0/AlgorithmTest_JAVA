package Baekjoon.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class boj5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for(int i = 0; i < T; i++){
            String command = br.readLine();
            int N = Integer.parseInt(br.readLine());

            LinkedList<Integer> deque = new LinkedList<>();
            String arr = br.readLine();
            for(String a : arr.substring(1,arr.length()-1).split(",")){
                if (!a.equals(""))
                    deque.add(Integer.valueOf(a));
            }

            System.out.println(ac(deque,command));
        }


    }

    static String ac(LinkedList<Integer> deque, String command){
        boolean reverse = false;
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'R'){
                reverse = !reverse;
            }else{
                if(deque.size() == 0 ) return "error";
                if(reverse) deque.removeLast();
                else deque.removeFirst();
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
