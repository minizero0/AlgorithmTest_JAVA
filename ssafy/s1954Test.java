package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1954Test {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};

        T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            int arr[][] = new int[n][n];
            int loc = 0;
            int x = 0, y = 0;
            for(int i = 1; i <= n*n; i++){
                arr[x][y] = i;
                if(x + dx[loc] < 0 || x + dx[loc] >= n || y + dy[loc] < 0 || y+ dy[loc] >= n || arr[x+dx[loc]][y+dy[loc]] != 0){
                    loc = (loc + 1) % 4;
                }
                x += dx[loc];
                y += dy[loc];
            }
            System.out.println("#"+t);
            for(int i = 0; i < n; i++) {
                for (int j : arr[i]){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
