package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj4179_Test {
    static int[][] miro;
    static int R, C, res;
    static Queue<State> fire, jh;
    static int[] dx, dy;

    private static boolean bfs() {

        while (!jh.isEmpty()) {
            int size = fire.size();
            for (int i = 0; i < size; i++) {
                State now = fire.poll();
                for (int k = 0; k < 4; k++) {
                    int n_x = dx[k] + now.x;
                    int n_y = dy[k] + now.y;

                    if(n_x < 0 || n_y < 0 || n_x >= R || n_y >= C) continue;
                    if(miro[n_x][n_y] == 'F' || miro[n_x][n_y] == '#') continue;

                    miro[n_x][n_y] = 'F';
                    fire.offer(new State(n_x, n_y, now.d + 1));
                }
            }

            size = jh.size();
            for (int i = 0; i < size; i++) {
                State now = jh.poll();
                for (int k = 0; k < 4; k++) {
                    int n_x = dx[k] + now.x;
                    int n_y = dy[k] + now.y;

                    if (n_x < 0 || n_y < 0 || n_x >= R || n_y >= C) {
                        res = now.d + 1;
                        return true;
                    }
                    if (miro[n_x][n_y] == 'F' || miro[n_x][n_y] == '#' || miro[n_x][n_y] =='J') continue;

                    miro[n_x][n_y] = 'J';
                    jh.offer(new State(n_x, n_y, now.d + 1));
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        miro = new int[R][C];
        fire = new LinkedList<>();
        jh = new LinkedList<>();
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{1, 0, -1, 0};

        res = 0;

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                miro[i][j] = s.charAt(j);

                if(miro[i][j] == 'J') jh.offer(new State(i, j, 0));
                if(miro[i][j] == 'F') fire.offer(new State(i, j, 0));
            }
        }
        if(bfs()) System.out.println(res);
        else System.out.println("IMPOSSIBLE");
    }


    static class State {
        int x, y, d;

        public State(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }
}

