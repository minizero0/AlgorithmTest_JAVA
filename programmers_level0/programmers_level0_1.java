package programmers_level0;//        옹알이 문제.

//        1 ≤ babbling의 길이 ≤ 100
//        1 ≤ babbling[i]의 길이 ≤ 15
//        babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
//        즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
//        문자열은 알파벳 소문자로만 이루어져 있습니다.
public class programmers_level0_1 {
    public static int solution(String[] babbling) {
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            //replace
            babbling[i] = babbling[i].replaceFirst("aya", "1");
            babbling[i] = babbling[i].replaceFirst("ye", "1");
            babbling[i] = babbling[i].replaceFirst("woo", "1");
            babbling[i] = babbling[i].replaceFirst("ma", "1");
            System.out.println(babbling[i]);
            babbling[i] = babbling[i].replace("1", "");     //replace로 문자열 내 1을 공백으로 변환
            if (babbling[i].isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String arr[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution(arr));
    }
}
