package programmers_level1;

public class pro_147355 {

    public static int solution(String t, String p) {
        int answer = 0 ;

        Long pLong = Long.parseLong(p);

        for(int i = 0; i < t.length() - p.length() + 1; i++){
            String temp = t.substring(i, i + p.length());

            if(pLong >= Long.parseLong(temp)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("3141592","271"));
        System.out.println(solution("500220839878","7"));
        System.out.println(solution("10203","15"));
    }

}
