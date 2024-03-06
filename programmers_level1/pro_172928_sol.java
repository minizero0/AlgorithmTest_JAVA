package programmers_level1;

import java.util.Arrays;

/*op는 다음 네 가지중 하나로 이루어져 있습니다.
        N : 북쪽으로 주어진 칸만큼 이동합니다.
        S : 남쪽으로 주어진 칸만큼 이동합니다.
        W : 서쪽으로 주어진 칸만큼 이동합니다.
        E : 동쪽으로 주어진 칸만큼 이동합니다.*/
public class pro_172928_sol {
    public static int[] solution(String[] park, String[] routes) {
        char[][] park_array = new char[park.length][park[0].length()];
        int H = 0;
        int W = 0;

        int H_max = park.length;
        int W_max = park[0].length();

        for(int i = 0; i < park.length; i++){               //공원 2차원 배열 초기화
            for(int j = 0; j < park[i].length(); j++){
                park_array[i][j] = park[i].charAt(j);

                if(park_array[i][j] == 'S') {               //시작 위치
                    H = i;
                    W = j;
                }
            }
        }

        System.out.println(H + "," + W);

        for(String route : routes){
            char dir = route.charAt(0);             //방향
            int dis = route.charAt(2) - 48;         //이동거리
            boolean flag = true;

            if(dir == 'N' && H - dis >= 0){
                for(int i = 1; i <= dis; i++){
                    if(park_array[H-i][W] == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                H -= dis;
            }

            if(dir == 'S' && H + dis < H_max){
                for(int i = 1; i <= dis; i++){
                    if(park_array[H+i][W] == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                H += dis;
            }

            if(dir == 'E' && W + dis < W_max){
                for(int i = 1; i <= dis; i++){
                    if(park_array[H][W+i] == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                W += dis;
            }

            if(dir == 'W' && W - dis >= 0 ){
                for(int i = 1; i <= dis; i++){
                    if(park_array[H][W-i] == 'X'){
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                W -= dis;
            }
            System.out.println(H + "," + W);
        }

        return new int[]{H,W};
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
//        System.out.println(Arrays.toString(solution(new String[]{"SOO", "OXX", "OOO"}, new String[]{"E 2", "S 2", "W 1"})));
//        System.out.println(Arrays.toString(solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"})));
        System.out.println(Arrays.toString(solution(new String[]{"OXO", "XSX", "OXO"}, new String[]{"S 1", "E 1", "W 1", "N 1"})));
    }
}
