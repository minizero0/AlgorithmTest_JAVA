package programmers_level1;

public class pro_택배상자꺼내기 {


        public static int solution(int n, int w, int num) {
            // num의 층과 위치 인덱스
            int row = (num - 1) / w;
            int idx = (num - 1) % w;

            int count = 1; // 자기 자신 포함

            // 위층 확인
            for (int r = row + 1; ; r++) {
                int start = r * w + 1;
                if (start > n) break;

                int end = Math.min(start + w - 1, n);
                int boxesInRow = end - start + 1;

                // 같은 idx 위치에 상자가 있으면 위에 쌓임
                if (idx < boxesInRow) {
                    count++;
                }
            }

            return count;
        }




    public static void main(String[] args) {
//        22	6	8	3
        System.out.println(solution(22,6,8));
    }
}
