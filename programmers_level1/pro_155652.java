package programmers_level1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pro_155652 {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c += 1;

                if (c > 'z') c = 'a';                               //z가 넘어갈 경우 a로 초기화

                if(skip.contains(String.valueOf(c))) j--;           //skip 단어가 포함되어 있는지 확인
            }
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }
}
