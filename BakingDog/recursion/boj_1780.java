package BakingDog.recursion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1780 {
    static int[][] arr;
    static int zero = 0;
    static int plus = 0;
    static int minus = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        StringTokenizer st;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,n);

        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);

    }

    public static void partition(int row, int col, int size){

        if(checkNumber(row,col,size)){
            if(arr[row][col] == 0) zero++;
            else if(arr[row][col] == 1) plus++;
            else minus++;
            return;
        }

        int newSize = size / 3;

        partition(row, col, newSize);
        partition(row, col + newSize, newSize);
        partition(row, col + newSize*2, newSize);
        partition(row + newSize, col, newSize);
        partition(row + newSize*2, col, newSize);
        partition(row + newSize, col + newSize, newSize);
        partition(row + newSize*2, col + newSize*2, newSize);


    }

    public static boolean checkNumber(int row, int col, int size){
        int number = arr[row][col];
        for(int i = row; i < row+size; i++){
            for(int j = col; j < col+size; j++){
                if(arr[i][j] != number) return false;
            }
        }
        return true;
    }
}
