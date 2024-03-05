package programmers_level1;

import java.util.Arrays;

/*op는 다음 네 가지중 하나로 이루어져 있습니다.
        N : 북쪽으로 주어진 칸만큼 이동합니다.
        S : 남쪽으로 주어진 칸만큼 이동합니다.
        W : 서쪽으로 주어진 칸만큼 이동합니다.
        E : 동쪽으로 주어진 칸만큼 이동합니다.*/
public class pro_172928 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int H = 0;
        int W = 0;

        int H_max = park.length;            //최대 세로 길이
        int W_max = park[0].length();       //최대 가로 길이

        for(int i = 0; i < routes.length; i++){
            char c = routes[i].charAt(0);
            H += routes[i].charAt(2) - 30;
            if(c == 'N'){

            }
        }




        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
    }
}
