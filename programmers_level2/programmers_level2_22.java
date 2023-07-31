package programmers_level2;

//  프로세스

import java.util.Deque;
import java.util.LinkedList;

public class programmers_level2_22 {
    int n1;
    int n2;
    public programmers_level2_22(int n1, int n2) {
        n1 = this.n1;
        n2 = this.n2;
    }


    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<programmers_level2_22> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++){
            queue.offer(new programmers_level2_22(priorities[i], i));
        }

        int count = 0;
        int des = -1;
        while(des != location){
            int n = queue.peek().n1;
            for(int i = 1; i < queue.size(); i++){
            }

            if(des != location){
                queue.offer(queue.pop());
                count++;
            }else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,1,3,2},2));
    }

}