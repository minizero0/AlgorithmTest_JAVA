package programmers_level0;
//        짝수는 싫어요

import java.util.stream.IntStream;

//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
public class programmers_level0_16 {
    public static int[] solution(int n) {
        int arr[];
//        if (n % 2 == 0){
//            arr = new int[n/2];
//        }else{
//            arr = new int[n/2+1];
//        }
//
//        int j = 0;
//        for(int i = 1; i <= n; i++){
//            if(i % 2 == 1){
//                arr[j++] = i;
//            }
//        }
        arr = IntStream.rangeClosed(1,n).filter(value -> value % 2 != 0).toArray();
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));

    }
}
