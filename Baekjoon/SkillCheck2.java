package Baekjoon;

//  두 정수 left와 right가 매개변수로 주어집니다.
//  left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
//  약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

public class SkillCheck2 {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int num = 0;
            for(int j = 1; j <= i; j++) if(i % j == 0) num++;
            if(num % 2 == 0) answer += i;
            else answer -= i;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }
}
