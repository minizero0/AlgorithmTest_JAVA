package BakingDog.BFS;

//지훈이는 미로에서 일을 한다. 지훈이를 미로에서 탈출하도록 도와주자!
//미로에서의 지훈이의 위치와 불이 붙은 위치를 감안해서 지훈이가 불에 타기전에 탈출할 수 있는지의 여부, 그리고 얼마나 빨리 탈출할 수 있는지를 결정해야한다.
//지훈이와 불은 매 분마다 한칸씩 수평또는 수직으로(비스듬하게 이동하지 않는다) 이동한다.
//불은 각 지점에서 네 방향으로 확산된다.
//지훈이는 미로의 가장자리에 접한 공간에서 탈출할 수 있다.
//지훈이와 불은 벽이 있는 공간은 통과하지 못한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_4179 {
    static int n,m;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Pair> jq;
    static Queue<Pair> fq;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] miro = new char[n][m];
        int[][] visit = new int[n][m];
        Queue<Pair>jq = new LinkedList<>();
        Queue<Pair>fq = new LinkedList<>();

        int result = 0;

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int j = 0; j < m; j++){
                miro[i][j] = s.charAt(j);
                visit[i][j] = -1;
                if(s.charAt(j) == 'F'){
                    fq.offer(new Pair(i,j));
                    visit[i][j] = 0;
                }else if(s.charAt(j) == 'J'){
                    jq.offer(new Pair(i,j));
                }
            }
        }

        while (true){
            result++;
            while(!fq.isEmpty()){
                Pair p = fq.poll();
                for(int i = 0; i < 4; i++){
                    int n_x = p.x + dx[i];
                    int n_y = p.y + dy[i];
                    if(n_x < 0 || n_x >= n || n_y < 0 || n_y >=m) continue;
                    if(miro[n_x][n_y] == '#' || visit[n_x][n_y] != -1) continue;
                    fq.offer(new Pair(n_x,n_y));
                    visit[n_x][n_y] = visit[p.x][p.y] + 1;
                    System.out.println("visit["+n_x+"]["+n_y+"] = " +visit[n_x][n_y]);
                }
            }
            System.out.println(result);

            while(!jq.isEmpty()){
                Pair p = jq.poll();
                for(int i = 0; i < 4; i++){
                    int n_x = p.x + dx[i];
                    int n_y = p.y + dy[i];
                    if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m){
                        System.out.println(result);
                        return;
                    }
                    if(miro[n_x][n_y] == '.' && visit[n_x][n_y] == -1){
                        jq.offer(new Pair(n_x,n_y));
                        visit[n_x][n_y] = visit[p.x][p.y] + 1;
                    }
                }
            }
            if(jq.isEmpty()){
                System.out.println("IMPOSSIBLE");
                return;
            }
        }






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
