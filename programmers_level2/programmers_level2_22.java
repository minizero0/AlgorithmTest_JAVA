package programmers_level2;

//  프로세스

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class programmers_level2_22 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<Integer> queue = new LinkedList<>();

        int number = priorities[location];
        for(int i = 0; i < priorities.length; i++){
            queue.offer(priorities[i]);
        }

        
        return answer;
    }

}