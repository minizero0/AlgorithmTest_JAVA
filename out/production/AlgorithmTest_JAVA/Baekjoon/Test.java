package out.production.AlgorithmTest_JAVA.Baekjoon;

public class Test {
    public static int[][] solution(int n, int m, int[] fold, int[][] cut) {
        int[][] answer = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                answer[i][j] = 1;
            }
        }

        int n_cut = n;
        int m_cut = m;

        int sero = 0;
        int garo = 0;

        for (int i = 0; i < fold.length; i++) {
            if(fold[i] == 1) {
                m_cut /= 2;
                garo++;
            }
            else {
                n_cut /= 2;
                sero++;
            }
        }

        for (int i = 0; i < cut.length; i++) {
                int x = cut[i][0];
                int y = cut[i][1];

                if(x > n_cut || y > m_cut) continue;
                answer[x-1][y-1] = 0;

        }

        return answer;
    }

    public static void main(String[] args) {
        solution(8, 6, new int[]{1, -1, -1}, new int[][]{{1, 1}, {2, 2}, {4, 4}});
    }
}
