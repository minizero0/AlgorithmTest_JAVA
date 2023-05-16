package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int dx[] = {0,1,0,-1};
        int dy[] = {1,0,-1,0};

        for(int t = 1; t <= T; t++){
            int n = Integer.parseInt(br.readLine());
            int num = 1;
            int arr[][] = new int[n][n];
            int r = 0, c = 0;
            int dir = 0;

            for(int i = 1; i <= n * n; i++){
                arr[r][c] = i;
                if(r+dx[dir] < 0 || r+dx[dir] >= n || c+dy[dir] < 0 || c+dy[dir] >= n || arr[r + dx[dir]][c + dy[dir]] != 0) dir = (dir + 1) % 4;
                r += dx[dir];
                c += dy[dir];
            }
            System.out.println("#" + t);
            for (int i = 0; i < n; i++) {
                for (int z : arr[i])
                    System.out.print(z + " ");
                System.out.println();
            }
        }
    }
}
