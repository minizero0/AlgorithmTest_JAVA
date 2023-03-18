package programmers_level1;
//        문자열을 정수로 바꾸기

//  문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

import java.util.Arrays;

public class programmers_level1_10 {
    public static int solution(String s) {

        return Integer.parseInt(s);
    }


    public static void main(String[] args) {
        System.out.println(solution("-1234"));
    }
}
