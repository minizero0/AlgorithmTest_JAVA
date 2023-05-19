package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1209 {
    static int board[][] = new int[100][100];
    static int MAX;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = 10;
        for(int t = 1; t <= T; t++){
            String a = br.readLine();
            MAX = 0;
            int sum = 0;
            for(int i = 0; i < 100; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 100; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }



            for(int i = 0; i < 100; i++){
                sum = 0;
                for(int j = 0; j < 100; j++){
                    sum += board[i][j];
                }
                if(sum > MAX) MAX = sum;
            }

            for(int i = 0; i < 100; i++){
                sum = 0;
                for(int j = 0; j < 100; j++){
                    sum += board[j][i];
                }
                if(sum > MAX) MAX = sum;
            }

            sum = 0;

            for(int i = 0; i < 100; i++){
                sum += board[i][i];
            }
            if(sum > MAX) MAX = sum;

            sum = 0;
            for(int i = 99; i >= 0; i--){
                sum += board[i][i];
            }
            if(sum > MAX) MAX = sum;

            System.out.println("#"+t+" "+MAX);

        }

    }
}
