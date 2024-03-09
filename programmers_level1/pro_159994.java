package programmers_level1;


public class pro_159994 {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {

        String answer = "Yes";

        int cards1_num = 0;
        int cards2_num = 0;

        for(String str : goal) {
            if (str.equals(cards1[cards1_num])) {
                if(cards1_num == cards1.length - 1) continue;
                cards1_num++;
                continue;
            }
            if (str.equals(cards2[cards2_num])) {
                if(cards2_num == cards2.length - 1) continue;
                cards2_num++;
                continue;
            }
            answer = "No";
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want","to"}, new String[]{"i", "want", "to", "drink", "water"}));
        System.out.println(solution(new String[]{"i", "water", "drink"}, new String[]{"want","to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
