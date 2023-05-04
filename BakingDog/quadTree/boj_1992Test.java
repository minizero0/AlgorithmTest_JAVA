package BakingDog.quadTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1992Test {

    static int[][] board;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                board[i][j] = s.charAt(j) - '0';
            }
        }

        partition(0,0,N);
        System.out.println(sb);
    }

    public static void partition(int row, int col, int size){
        if(checkNumber(row,col,size)){
            if(board[row][col] == 0) sb.append("0");
            else sb.append("1");
            return;
        }

        int newSize = size / 2;

        sb.append("(");
        partition(row, col ,newSize);
        partition(row, col+newSize ,newSize);
        partition(row+newSize, col ,newSize);
        partition(row+newSize, col+newSize ,newSize);
        sb.append(")");

    }

    public static boolean checkNumber(int row, int col, int size){
        int number = board[row][col];
        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){
                if(board[i][j] != number) return false;
            }
        }
        return true;
    }
}
