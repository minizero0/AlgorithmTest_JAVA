package programmers_level0;
//        두 수의 나눗셈

//정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에
// 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요
public class programmers_level0_10 {
    public static int solution(int num1, int num2) {
        int answer = 0;
        float num3 = (float)num1/num2 * 1000;
        answer = (int)Math.floor(num3);         //소수점을 버리고 float형을 int형으로 변환 하여 answer에 값을 넣어주고 리턴

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(7, 3));
    }
}
