package programmers_level0;
//          배열 두배 만들기

import java.util.Arrays;
import java.util.stream.IntStream;

//       정수 배열 numbers가 매개변수로 주어집니다.
//       numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class programmers_level0_28 {
    public static int[] solution(int[] numbers) {
//        int[] arr = Arrays.stream(numbers).map(i -> i * 2).toArray();

        for(int i = 0; i <numbers.length; i++){
            numbers[i] *= 2;
            System.out.println(numbers[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,5}));

    }
}
