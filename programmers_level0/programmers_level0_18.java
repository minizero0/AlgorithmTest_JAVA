package programmers_level0;
//          배열 뒤집기

//        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
//        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

public class programmers_level0_18 {
    public static int[] solution(int[] num_list) {
        int answer[] = {};


        for(int i = 0; i <num_list.length/2; i++){
            int temp = 0;
            temp = num_list[i];
            num_list[i] = num_list[num_list.length-i-1];
            num_list[num_list.length-i-1] = temp;

        }
        for(int i = 0; i < num_list.length; i++){
            System.out.println(num_list[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 3, 5};
        System.out.println(solution(arr));

    }
}
