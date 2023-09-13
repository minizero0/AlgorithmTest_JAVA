package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj4179_Two {

    static char[][] board;
    static int R, C, res;
    static int[] dx;
    static int[] dy;
    static Queue<State> fire;
    static Queue<State> jh;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new char[R][C];
        dx = new int[]{0, 1, 0, -1};
        dy = new int[]{1, 0, -1, 0};
        fire = new LinkedList<>();
        jh = new LinkedList<>();

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = s.charAt(j);

                if(board[i][j] == 'J') jh.add(new State(i, j, 0));
                if(board[i][j] == 'F') fire.add(new State(i, j, 0));
            }
        }

        if(bfs()) System.out.println(res);
        else System.out.println("IMPOSSIBLE");
    }

    static boolean bfs() {
        while (!jh.isEmpty()) {
            int size = fire.size();

            for (int i = 0; i < size; i++) {
                State now = fire.poll();

                for (int k = 0; k < 4; k++) {
                    int n_x = dx[k] + now.x;
                    int n_y = dy[k] + now.y;
                    if(n_x < 0 || n_y < 0 || n_x >= R || n_y >= C) continue;
                    if(board[n_x][n_y] == '#' || board[n_x][n_y] == 'F') continue;

                    board[n_x][n_y] = 'F';
                    fire.add(new State(n_x, n_y, now.d + 1));
                }
            }

            size = jh.size();
            for (int i = 0; i < size; i++) {
                State now = jh.poll();

                for (int k = 0; k < 4; k++) {
                    int n_x = dx[k] + now.x;
                    int n_y = dy[k] + now.y;
                    if(n_x < 0 || n_y < 0 || n_x >= R || n_y >= C) {
                        res = now.d + 1;
                        return true;
                    }
                    if(board[n_x][n_y] == '#' || board[n_x][n_y] == 'F' || board[n_x][n_y] == 'J') continue;

                    board[n_x][n_y] = 'J';
                    jh.add(new State(n_x, n_y, now.d + 1));
                }
            }
        }
        return false;
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
