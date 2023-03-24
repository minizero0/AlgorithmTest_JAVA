package programmers_level2;
//          피보나치 수

import java.util.Arrays;

//  피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//  예를들어
//  F(2) = F(0) + F(1) = 0 + 1 = 1
//  F(3) = F(1) + F(2) = 1 + 1 = 2
//  F(4) = F(2) + F(3) = 1 + 2 = 3
//  F(5) = F(3) + F(4) = 2 + 3 = 5
//  와 같이 이어집니다.
//  2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
public class programmers_level2_5 {

    public static int solution(int n) {
//        int answer = 0;
//        if(n ==0) answer = 0;
//        else if(n == 1 || n == 2) answer = 1;
//        else if (n >= 3) answer = (solution(n - 2) + solution(n - 1));
//        return answer;
        int answer = 0;
        int f1 = 0;
        int f2 = 1;
        int d = 1234567;
        for (int i = 2; i <= n; i++){
            answer = (f1+f2)%d;
            f1 = f2;
            f2 = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
