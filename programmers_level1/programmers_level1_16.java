package programmers_level1;
//        핸드폰 번호 가리기

//  프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//  전화번호가 문자열 phone_number로 주어졌을 때,
//  전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

import java.util.Arrays;

public class programmers_level1_16 {
    public static String solution(String phone_number) {
        int cnt = phone_number.length();
        String answer ="";
        for(int i = 0; i < cnt; i++){
            if(i + 4 == cnt){
                for(int j = i; j < cnt; j++){
                    answer += phone_number.charAt(j);
                }
                break;
            }
            answer += "*";

        }
        return answer;

    }


    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }
}
