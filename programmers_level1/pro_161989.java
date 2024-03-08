package programmers_level1;

//덧칠하기
public class pro_161989 {

    public static int solution(int n, int m , int[] section){
       int start = section[0];
       int end = section[0] + (m-1);
       int answer = 1;

       for(int i : section){
           if(i >= start && i <= end) continue;
           else{
               start = i;
               end = i + (m-1);
               answer++;
           }
       }
       return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8,4, new int[]{2,3,6}));
        System.out.println(solution(5,4,new int[]{1,3}));
        System.out.println(solution(4,1, new int[]{1,2,3,4}));
    }
}
