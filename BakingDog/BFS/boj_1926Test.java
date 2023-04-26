package BakingDog.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1926Test {
    static int n,m;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];
        qu = new LinkedList<>();
        dx = new int[] {1,0,-1,0};
        dy = new int[] {0,1,0,-1};

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0 || visit[i][j]) continue;
                qu.offer(new Pair(i,j));
                count++;
                visit[i][j] = true;
                area = 0;

                while(!qu.isEmpty()){
                    Pair p = qu.poll();
                    area++;
                    for(int k = 0; k < 4; k++){
                        int n_x = p.x + dx[k];
                        int n_y = p.y + dy[k];
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;
                        if(arr[n_x][n_y] == 1 && !visit[n_x][n_y]){
                            qu.offer(new Pair(n_x,n_y));
                            visit[n_x][n_y] = true;
                        }
                    }
                }
                if(area > max) max = area;
            }
        }
        System.out.println(count);
        System.out.println(area);
    }

    public static class Pair{
        int x,y;

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
