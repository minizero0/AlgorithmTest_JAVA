package programmers_level1;
//        평균 구하기

//  정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
public class programmers_level1_1 {
    public static double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer/arr.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4}));
    }
}
