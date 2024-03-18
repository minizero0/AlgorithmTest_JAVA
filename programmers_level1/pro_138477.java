package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pro_138477 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < score.length; i++){
            if(list.size() < k){
                list.add(score[i]);
            }else{
                if(list.get(0) < score[i]) list.set(0, score[i]);
            }
            Collections.sort(list);

            answer[i] = list.get(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }
}
