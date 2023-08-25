package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2178 {
    static int board[][];
    static int vis[][];
    static int dx[];
    static int dy[];
    static int n,m;
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        vis = new int[n][m];
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                board[i][j] = s.charAt(j) - '0';
                vis[i][j] = -1;
            }
        }

        queue.offer(new Pair(0, 0));
        vis[0][0] = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();

            for (int i = 0; i < 4; i++) {
                int n_x = dx[i] + p.x;
                int n_y = dy[i] + p.y;

                if (n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;

                if(vis[n_x][n_y] != -1 || board[n_x][n_y] == 0) continue;

                queue.offer(new Pair(n_x, n_y));
                vis[n_x][n_y] = vis[p.x][p.y] + 1;
            }

        }
        System.out.println(vis[n-1][m-1]+1);

    }

    public static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

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
    }
}
