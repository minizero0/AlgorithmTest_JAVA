package programmers_level1;

import java.util.Arrays;

/*op는 다음 네 가지중 하나로 이루어져 있습니다.
        N : 북쪽으로 주어진 칸만큼 이동합니다.
        S : 남쪽으로 주어진 칸만큼 이동합니다.
        W : 서쪽으로 주어진 칸만큼 이동합니다.
        E : 동쪽으로 주어진 칸만큼 이동합니다.*/
public class pro_172928 {
    public static int[] solution(String[] park, String[] routes) {
        int H = 0;
        int W = 0;

        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    H = i;
                    W = j;
                }
            }
        }
        int H_max = park.length;            //최대 세로 길이
        int W_max = park[0].length();       //최대 가로 길이

        for (String route : routes) {
            boolean flag = true;
            char c = route.charAt(0);           //동서남북
            int r = route.charAt(2) - 48;       //이동할 거리

            if(c == 'N'){
                if(H - r < 0) continue;
                for(int i = 0; i < r; i++){
                    if(park[H-i].charAt(W) == 'X'){
                        flag = false;
                        break;
                    }
                }

                if(!flag) continue;

                H -= r;
            }
            if(c == 'S') {
                if (H + r >= H_max) continue;
                for(int i = 0; i < r; i++){
                    if(park[H+i].charAt(W) == 'X'){
                        flag = false;
                        break;
                    }
                }

                if(!flag) continue;
                H += r;
            }
            if(c == 'W'){
                if(W - r < 0) continue;
                for(int i = 0; i < r; i++){
                    if(park[H].charAt(W-i) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                W -= r;
            }
            if(c == 'E') {
                if (W + r >= W_max) continue;
                for(int i = 0; i < r; i++){
                    if(park[H].charAt(W+i) == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                W += r;
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
