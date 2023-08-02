package programmers_level2;

//  프로세스

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class programmers_level2_22 {
    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : priorities) queue.add(n);

        int count = 0;
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == queue.peek()){
                    queue.poll();
                    count++;

                    if(i == location) return count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,1,3,2}, 2));
    }
}