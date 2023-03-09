package programmers_level0;
//        두수의 합 구하기 문제

//정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
public class programmers_level0_6 {
    public static int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(10,5));
    }
}
