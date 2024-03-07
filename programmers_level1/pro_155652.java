package programmers_level1;


public class pro_155652 {
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 1; j <= index; j++){

                for(int k = 0; k < skip.length(); k++){
                    if(skip.charAt(k) == c + j) c + 1;
                }
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }
}
