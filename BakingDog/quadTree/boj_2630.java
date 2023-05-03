package BakingDog.quadTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2630 {
    static int N;
    static int[][] arr;
    static int white = 0, blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        StringTokenizer st;
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,N);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void partition(int row, int col, int size){
        if(colorCheck(row,col,size)){
            if(arr[row][col] == 0) white++;
            else blue++;
            return;
        }

        int newSize = size / 2;
        partition(row, col, newSize);                            //2사분면
        partition(row, col+newSize, newSize);                //1사분면
        partition(row+newSize, col, newSize);                //3사분면
        partition(row+newSize, col+newSize, newSize);    //4사분면
    }

    //현재 파티션 색상 체크
    public static boolean colorCheck(int row, int col, int size){
        int color = arr[row][col];  //첫번째 원소 기준 검사

        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                //색상이 같지 않다면 false return
                if(color != arr[i][j]) return false;
            }
        }
        //색상이 같다면 true return
        return true;

    }
}
