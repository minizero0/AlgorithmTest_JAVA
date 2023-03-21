package programmers_level1;
//        가운데 글자 가져오기

//  단어 s의 가운데 글자를 반환하는 함수,
//  solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

public class programmers_level1_18 {
    public static String solution(String s) {
        int cnt = s.length();
        String answer = "";
        if(cnt % 2 == 0){
            answer += s.charAt(cnt/2-1);
            return answer += s.charAt(cnt/2);
        }else{
            return answer += s.charAt(cnt/2);
        }
    }


    public static void main(String[] args) {
        System.out.println(solution("qwer"));
    }
}
