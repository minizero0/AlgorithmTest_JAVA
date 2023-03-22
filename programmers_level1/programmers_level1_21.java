package programmers_level1;
//        문자열 내림차순으로 배치하기

import java.util.Arrays;

//  문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//  s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
public class programmers_level1_21 {
    public static String solution(String s) {
        char[] arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            arr[i] = s.charAt(i);
        }
        arr.toString();
        String answer = "";
        Arrays.sort(arr);
        for(int i = arr.length-1; i >= 0; i--){
            answer += arr[i];
        }
        return answer;
//          아래의 코드가 훨씬 효율적이다. String 문자열의 + 연산은 메모리적 낭비를 유발하기 때문이다.
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//        return new StringBuilder(new String(arr)).reverse().toString();

    }


    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
