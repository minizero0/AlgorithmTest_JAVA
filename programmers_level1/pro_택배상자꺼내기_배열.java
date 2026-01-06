package programmers_level1;

public class pro_택배상자꺼내기_배열 {
    public static int solution(int n, int w, int num) {
        int maxRow = (n / w) + 1;
        int count = 0;

        int storage[][] = new int[maxRow][w];
        int curNum = 1;
        int targetR = 0;
        int targetC = 0;

        for (int i = 0; i < maxRow; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < w; j++) {
                    if (curNum > n) break;
                    storage[i][j] = curNum;
                    if(curNum == num) {targetR = i; targetC = j;}
                    curNum++;
                }
            } else{
                for (int j = w - 1; j >= 0; j--) {
                    if (curNum > n) break;
                    storage[i][j] = curNum;
                    if(curNum == num) {targetR = i; targetC = j;}
                    curNum++;
                }
            }
            if(curNum > n) break;
        }

        for (int i = targetR; i < maxRow; i++) {
            if (storage[i][targetC] != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(22,6,8));
        System.out.println(solution(13,3,6));
    }
}
