package programmers_level1;

/*
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
*/


public class pro_크기가작은문자열 {
    public static int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i <= t.length()-p.length(); i++) {
            String str = t.substring(i, i+p.length());

            if(Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("10203", "15"));

    }
}
