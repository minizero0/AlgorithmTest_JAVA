package programmers_level1;

public class pro_택배상자꺼내기 {


        public static int solution(int n, int w, int num) {
            int answer = 0;

            // 1. 목표 상자(num)의 위치 찾기
            int targetRow = (num - 1) / w;
            int targetCol = getColumn(num, w, targetRow);

            // 2. 전체 상자 개수(n)가 몇 층까지 있는지 확인
            int maxRow = (n - 1) / w;

            // 3. 목표 상자가 있는 층부터 꼭대기 층까지 수직으로 올라가며 확인
            for (int r = targetRow; r <= maxRow; r++) {
                // 현재 층(r)에서 targetCol 위치에 있는 상자의 번호를 역산
                int currentNum = getNumberAt(r, targetCol, w);

                // 계산된 번호가 실제 존재하는 상자 번호(n 이하)라면 카운트
                if (currentNum <= n) {
                    answer++;
                }
            }

            return answer;
        }

    // 특정 번호가 몇 번째 열(0 ~ w-1)에 있는지 계산하는 메서드
    private static int getColumn(int val, int w, int row) {
        int pos = (val - 1) % w;
        if (row % 2 == 0) {
            return pos; // 짝수 층: 왼쪽 -> 오른쪽 (0, 1, 2...)
        } else {
            return (w - 1) - pos; // 홀수 층: 오른쪽 -> 왼쪽 (w-1, w-2, ...)
        }
    }

    // 특정 행(row)과 열(col)에 위치한 상자 번호를 구하는 메서드
    private static int getNumberAt(int row, int col, int w) {
        if (row % 2 == 0) {
            // 짝수 층: row * w + col + 1
            return row * w + col + 1;
        } else {
            // 홀수 층: row * w + (w - 1 - col) + 1
            return row * w + (w - 1 - col) + 1;
        }
    }


    public static void main(String[] args) {
//        22	6	8	3
        System.out.println(solution(22,6,8));
        System.out.println(solution(13,3,6));
    }
}
