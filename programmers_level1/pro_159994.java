package programmers_level1;


public class pro_159994 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "";
        for(String str : goal){
            int a = 0;
            int b = 0;

            for (String string : cards1) {
                if (string.equals(str)) {
                    a = 1;
                    break;
                }
            }
            if(a == 1) continue;

            for (String s : cards2) {
                if (s.equals(str)) {
                    b = 1;
                    break;
                }
            }

            if(a == 0 && b == 0){
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want","to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
