package BakingDog.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2178Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] miro = new char[n][m];
        int[][] dist= new int[n][m];
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        Queue<Pair> qu = new LinkedList<>();

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                miro[i][j] = s.charAt(j);
                dist[i][j] = -1;
            }
        }

        qu.offer(new Pair(0,0));
        dist[0][0] = 0;
        while(!qu.isEmpty()){
            Pair p = qu.poll();

            for(int i = 0; i < 4; i++){
                int n_x = p.x + dx[i];
                int n_y = p.y + dy[i];
                if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;
                if(miro[n_x][n_y] == '0' || dist[n_x][n_y] != -1) continue;

                qu.offer(new Pair(n_x,n_y));
                dist[n_x][n_y] = dist[p.x][p.y] + 1;
            }
        }

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
