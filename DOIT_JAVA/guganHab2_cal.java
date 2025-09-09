package DOIT_JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//합배열 만들기
public class guganHab2_cal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        st = new StringTokenizer(s);



        int row = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[][] a = new int[row+1][row+1];
        int[][] d = new int[row + 1][row + 1]; //java는 배열 선언시 0으로 자동 초기화

        for (int i = 1; i < row+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < row+1; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < row+1; i++) {
            for (int j = 1; j < row+1; j++) {
                d[i][j] = d[i][j-1] + d[i-1][j] - d[i-1][j-1] + a[i][j];
            }
        }

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = d[x2][y2] - d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1];

            System.out.println(result);
        }

    }
}
