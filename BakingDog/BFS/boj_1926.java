package BakingDog.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1926 {
    static int n, m;
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
        dx = new int[] {1,0,-1,0};
        dy = new int[] {0,1,0,-1};
        qu = new LinkedList<>();

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
                //0이거나 방문한적 있으면 생략
                if(arr[i][j] == 0 || visit[i][j]) continue;

                count++;                    //1이고, 방문을 하지 않았으므로 시작점이 되니까 + 1
                qu.offer(new Pair(i, j));   //큐에 좌표 입력
                visit[i][j] = true;         //방문처리
                area = 0;                   //0이면 그림 끊김

                while(!qu.isEmpty()){
                    Pair p = qu.poll();
                    area++;                 //넓이 + 1
                    for (int k = 0; k < 4; k++){
                        int n_x = p.x + dx[k];
                        int n_y = p.y + dy[k];
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;
                        if(arr[n_x][n_y] == 1 && !visit[n_x][n_y]){
                            qu.offer(new Pair(n_x, n_y));
                            visit[n_x][n_y] = true;
                        }
                    }
                }
                if(area > max){
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
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
