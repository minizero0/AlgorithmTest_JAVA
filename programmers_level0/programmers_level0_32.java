package programmers_level0;
//          분수의 덧셈

import java.util.Arrays;

//       첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
//       두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
//       두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class programmers_level0_32 {
    static int educ(int a, int b){
        int r = a % b;         //큰 숫자를 작은 수로 나눈 나머지 계산
        if(r == 0) return b;   //나머지가 0이면 작은숫자가 최대공약수 이므로 리턴
        else return educ(b, r);//나머지가 0이 아니면 재귀로 리턴
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        numer1 *= denom2;
        numer2 *= denom1;
        answer[0] = numer1 + numer2;
        answer[1] = denom1 * denom2;
        int r = educ(answer[0], answer[1]);
        answer[0] /= r;
        answer[1] /= r;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9,2,1,3)));
    }
}
