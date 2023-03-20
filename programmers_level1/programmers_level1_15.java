package programmers_level1;
//        나누어 떨어지는 숫자 배열

//  array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//  divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

import java.util.Arrays;

public class programmers_level1_15 {
    public static int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) cnt++;
        }

        if(cnt == 0){
            return new int[] {-1};
        }
        int array[] = new int[cnt];

        cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor ==0){
                array[cnt++] = arr[i];
            }
        }
        Arrays.sort(array);
        return array;


    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3,2,6}, 5)));
    }
}
