package programmers_level2;
//          카펫

import java.util.Arrays;

//  Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
//  Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
//  Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로,
//  세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

public class programmers_level2_7 {
    public static int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = {0,0};

        for(int i = 3; i < sum; i++){
            int row = i;
            int col = sum / row;

            if(row > col) continue;
            if((row - 2) * (col - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24,24)));
    }
}