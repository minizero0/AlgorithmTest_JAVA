package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1974Test {
    static int board[][] = new int[9][9];
    static int res;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            res = 1;
            for(int i = 0; i < 9; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 9; j++) board[i][j] = Integer.parseInt(st.nextToken());
            }

            for(int i = 0; i < 9; i++){
                int arr[] = new int[9];
                for(int j = 0; j < 9; j++){
                    arr[board[i][j]-1]++;
                }
                for(int n : arr){
                    if( n == 0){
                        res = 0;
                        break;
                    }
                }
            }

            for(int i = 0; i < 9; i++){
                int arr[] = new int[9];
                for(int j = 0; j < 9; j++){
                    arr[board[j][i]-1]++;
                }
                for(int n : arr){
                    if( n == 0){
                        res = 0;
                        break;
                    }
                }
            }

            for(int i = 0; i <= 6; i+=3){
                for(int j = 0; j <= 6; j+=3){
                    int xSize = i+3;
                    int ySize = j+3;

                    int arr[] = new int[9];
                    for(int x = i; x < xSize; x++){
                        for(int y = j; y < ySize; y++){
                            arr[board[x][y]-1]++;
                        }
                    }
                    for(int n : arr){
                        if(n == 0){
                            res = 0;
                            break;
                        }
                    }
                }
            }


            System.out.println("#"+t+" "+res);
        }


    }
}
