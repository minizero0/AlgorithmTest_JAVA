package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj7576_Two {
    static int[][] tomatos;
    static int[][] days;
    static int[] dx;
    static int[] dy;
    static int n,m;
    static Queue<Pair> qu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        tomatos = new int[n][m];
        days = new int[n][m];
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        qu = new LinkedList<>();

        int result = 0;
        int notYet = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int num = Integer.parseInt(st.nextToken());
                tomatos[i][j] = num;
                days[i][j] = -1;
                if(num == 1){
                    qu.offer(new Pair(i, j));
                    days[i][j] = 0;
                }
                if(num == 0) notYet++;
            }
        }

        while (!qu.isEmpty()) {
            Pair p = qu.poll();

            for (int i = 0; i < 4; i++) {
                int n_x = p.x + dx[i];
                int n_y = p.y + dy[i];

                if (n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;

                if(tomatos[n_x][n_y] == -1 || days[n_x][n_y] != -1) continue;

                qu.offer(new Pair(n_x, n_y));
                days[n_x][n_y] = days[p.x][p.y] + 1;
                notYet--;

                if(days[n_x][n_y] > result) result = days[n_x][n_y];
            }
        }

        if(notYet > 0){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }


    }

    public static class Pair {
        int x, y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
