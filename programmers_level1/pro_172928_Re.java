package programmers_level1;

import java.util.Arrays;

/*op는 다음 네 가지중 하나로 이루어져 있습니다.
        N : 북쪽으로 주어진 칸만큼 이동합니다.
        S : 남쪽으로 주어진 칸만큼 이동합니다.
        W : 서쪽으로 주어진 칸만큼 이동합니다.
        E : 동쪽으로 주어진 칸만큼 이동합니다.*/
public class pro_172928_Re {
    public static int[] solution(String[] park, String[] routes) {
        char[][] park_array = new char[park.length][park[0].length()];
        int H = 0;
        int W = 0;

        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                park_array[i][j] = park[i].charAt(j);
            }
        }

        return new int[]{H,W};
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
        //System.out.println(Arrays.toString(solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
        System.out.println(Arrays.toString(solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"})));
    }
}
