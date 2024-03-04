package programmers_level0;
//        두수의 차 문제

//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
public class programmers_level0_2 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    public static int hello(){
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }
}
