package Baekjoon.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1021_Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) deque.add(i);

        st = new StringTokenizer(br.readLine());
        int count = 0;

        int arr[] = new int[M];

        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            int target = deque.indexOf(arr[i]);
            int half;

            if(deque.size() == 0) half = deque.size() / 2 - 1;
            else half = deque.size() / 2;

            if(target <= half){
                for(int j = 0; j < target; j++){
                    int n = deque.pollFirst();
                    deque.offerLast(n);
                    count++;
                }
            }else{
                for(int j = 0; j < deque.size() - target; j++){
                    int n = deque.pollLast();
                    deque.offerFirst(n);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
