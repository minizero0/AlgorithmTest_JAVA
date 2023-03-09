package programmers_level0;
//        두수의 곱 문제

//정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
public class programmers_level0_3 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(2,3));
    }
}
