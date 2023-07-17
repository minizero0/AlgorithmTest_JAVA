package test.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class boj5430Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            LinkedList<Integer> deque = new LinkedList<>();
            String str = br.readLine();
            int N = Integer.parseInt(br.readLine());
            String s = br.readLine();
            for(String a : s.substring(1, s.length()-1).split(",")){
                if(!a.equals("")){
                    deque.add(Integer.parseInt(a));
                }
            }
            System.out.println(AC(deque,str));
        }
    }

    static String AC(LinkedList<Integer> deque, String str){
        boolean reverse = false;

        for(char c : str.toCharArray()){
            if(c == 'R') reverse = !reverse;
            else{
                if(deque.size() == 0) return "error";
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
