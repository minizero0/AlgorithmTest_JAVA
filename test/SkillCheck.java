package test;

//  문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
//  각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
//  예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

import java.util.Arrays;

public class SkillCheck {
    public static String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length; i++){
            for(int j = i+1; j < strings.length; j++){
                if(strings[i].charAt(n) > strings[j].charAt(n)){
                    String a = strings[i];
                    strings[i] = strings[j];
                    strings[j] = a;
                }else if(strings[i].charAt(n) == strings[j].charAt(n)){
                    if(strings[i].charAt(n+1) > strings[j].charAt(n+1)){
                        String a = strings[i];
                        strings[i] = strings[j];
                        strings[j] = a;
                    }
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
    }
}
