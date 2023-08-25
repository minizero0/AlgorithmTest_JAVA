package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1926_two {
    static int[][] board;
    static boolean[][] vis;
    static int[] dx;
    static int[] dy;
    static int n,m;
    static Queue<Pair> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        vis = new boolean[n][m];
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, 1, 0, -1};
        queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int max = 0;
        int area = 0;


        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0 || vis[i][j]) continue;
                count++;
                queue.offer(new Pair(i, j));
                vis[i][j] = true;
                area = 0;

                while (!queue.isEmpty()) {
                    Pair p = queue.poll();
                    area++;
                    for (int k = 0; k < 4; k++) {
                        int n_x = dx[k] + p.x;
                        int n_y = dy[k] + p.y;
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;
                        if (board[n_x][n_y] == 1 && !vis[n_x][n_y]) {
                            queue.offer(new Pair(n_x, n_y));
                            vis[n_x][n_y] = true;
                        }
                    }
                }
                if(area > max) max = area;
            }
        }
        System.out.println(count);
        System.out.println(max);
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
