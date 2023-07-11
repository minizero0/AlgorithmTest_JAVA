package test.Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();

        int count = 0;

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            deque.add(i);
        }

        int arr[] = new int[M];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < M; i++){
            int target_idx = deque.indexOf(arr[i]);
            int half_idx;

            if(deque.size() % 2 == 0) half_idx = deque.size() / 2 - 1;
            else half_idx = deque.size() / 2;

            if(target_idx <= half_idx){
                for(int j = 0; j < target_idx; j++){
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }else{
                for(int j = 0; j < deque.size() - target_idx; j++){
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(count);
    }
}
