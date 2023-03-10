package programmers_level0;
//        최댓값 만들기

import java.util.Arrays;

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
public class programmers_level0_15 {
    public static int solution(int[] numbers) {
        int answer = 0;
//        int max = 0;
//        for(int i = 0; i <numbers.length;i++){
//            for(int j = i+1; j <numbers.length; j++){
//                if(numbers[i] * numbers[j] > max)
//                    max = numbers[i] * numbers[j];
//            }
//        }
//        answer = max;

        Arrays.sort(numbers);
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(arr));

    }
}
