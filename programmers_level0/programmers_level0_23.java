package programmers_level0;
//          배열 자르기

import java.util.Arrays;
import java.util.stream.IntStream;

//        정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
//        numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
public class programmers_level0_23 {
    public static int[] solution(int[] numbers, int num1, int num2) {
//        int[] answer = new int[num2-num1+1];
//        int cnt = 0;
//        for(int i = num1; i <= num2; i++){
//            answer[cnt++] = numbers[i];
//        }
//        for(int a : answer){
//            System.out.println(a);
//        }
//        return answer;

        return IntStream.rangeClosed(num1,num2).map(i -> numbers[i]).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(solution(arr,1,3));

    }
}
