package BakingDog.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2178 {
    static int n,m;
    static char[][] miro;
    static int[][] dist;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        miro = new char[n][m];          //미로저장배열
        dist = new int[n][m];           //거리계산배열
        dx = new int[] {1,0,-1,0};      //상하좌우 계산 x좌표
        dy = new int[] {0,1,0,-1};      //상하좌우 계산 y좌표
        qu = new LinkedList<>();

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                miro[i][j] = s.charAt(j);
                dist[i][j] = -1;                //거리를 -1로 세팅하면 방문여부 확인가능
            }
        }

        qu.offer(new Pair(0,0));
        dist[0][0] = 0;
        while(!qu.isEmpty()){
            Pair p = qu.poll();

            //상하좌우 계산
            for(int i = 0; i < 4; i++){
                int n_x = p.x + dx[i];
                int n_y = p.y + dy[i];

                //벽에 부딪히거나 범위를 넘어가면 pass
                if(n_x < 0 || n_x >=n || n_y <0 || n_y >= m) continue;
                //방문했거나 길이 아니라면 pass
                if(miro[n_x][n_y] == '0' || dist[n_x][n_y] != -1) continue;

                //큐에 좌표 입력
                qu.offer(new Pair(n_x,n_y));

                //한칸 이동했기 때문에 이전 출발지점에서 거리 + 1
                dist[n_x][n_y] = dist[p.x][p.y] + 1;
            }
        }

        //마지막 지점에서 거리 + 1 출력
        System.out.println(dist[n-1][m-1]+1);


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
