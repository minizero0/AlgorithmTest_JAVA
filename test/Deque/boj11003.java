package test.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj11003 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            deque.add(Integer.parseInt(st.nextToken()));
            if(deque.size() > L) deque.removeFirst();
            min(deque);
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }

    static void min(LinkedList<Integer> deque){
        int min = deque.get(0);

        for(int i = 0; i < deque.size(); i++){
            if(deque.get(i) <= min) min = deque.get(i);
        }
        sb.append(min).append(" ");
    }
}
