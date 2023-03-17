package programmers_level1;
//        자연수 뒤집어 배열로 만들기

//  자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
//  예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.


import java.util.Arrays;

public class programmers_level1_6 {
    public static int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        int i = 0;
        while(n > 0){
            answer[i++] = (int) (n%10);
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10000000000L)));
    }
}
