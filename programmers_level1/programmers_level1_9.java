package programmers_level1;
//        정수 내림차순으로 배치하기

//  함수 solution은 정수 n을 매개변수로 입력받습니다.
//  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//  예를들어 n이 118372면 873211을 리턴하면 됩니다.

import java.util.Arrays;

public class programmers_level1_9 {
    public static long solution(long n) {

        String number = String.valueOf(n);
        long arr[] = new long[number.length()];
        long sum = 0;
        for(int i = 0; i < number.length(); i++){
            long j = number.charAt(i) - '0';
            arr[i] = j;
        }
        Arrays.sort(arr);
        for(int i = 0; i < number.length(); i++){
            long j = arr[i];
            System.out.println(j);
            for(int k = 0; k < i; k++){
                j *= 10;
            }
            sum += j;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
