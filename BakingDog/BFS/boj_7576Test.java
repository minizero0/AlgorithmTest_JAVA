package BakingDog.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_7576Test {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] tomatos = new int[n][m];
        int[][] days = new int[n][m];
        Queue<Pair> qu = new LinkedList<>();
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int result = 0;
        int notYet = 0;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int num = Integer.parseInt(st.nextToken());
                tomatos[i][j] = num;
                days[i][j] = -1;
                if(num == 1){
                    qu.offer(new Pair(i,j));
                    days[i][j] = 0;
                }
                else if(num == 0) notYet++;
            }
        }

        if(notYet == 0){
            System.out.println(0);
            return;
        }

        while(!qu.isEmpty()){
            Pair p = qu.poll();

            for(int i = 0; i < 4; i++){
                int n_x = p.x + dx[i];
                int n_y = p.y + dy[i];
                if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m) continue;
                if(tomatos[n_x][n_y] == -1 || days[n_x][n_y] != -1) continue;
                qu.offer(new Pair(n_x,n_y));
                days[n_x][n_y] = days[p.x][p.y] + 1;
                notYet--;
                if(result < days[n_x][n_y]) result = days[n_x][n_y];
            }
        }
        if(notYet > 0) System.out.println(-1);
        else System.out.println(result);
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
