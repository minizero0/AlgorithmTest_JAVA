package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s2001Test {
    static int[][] arr;
    static int N,M;
    static int MAX;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N][N];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            MAX = 0;

            for(int i = 0; i <= N-M; i++){
                for(int j = 0; j <= N-M; j++){
                    getMax(i,j);
                }
            }
            System.out.println("#"+t+" "+MAX);
        }


    }

    private static void getMax(int x, int y) {
        int sum = 0;
        for(int i = x; i < x+M; i++){
            for(int j = y; j < y+M; j++){
                sum += arr[i][j];
            }
        }
        if(sum > MAX) MAX = sum;
    }

}
