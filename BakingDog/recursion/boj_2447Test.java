package BakingDog.recursion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2447Test {
    static char[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        print(0,0,N,false);

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void print(int row, int col, int size, boolean blank){
        if(blank){
            for(int i = row; i < row + size; i++){
                for(int j = col; j < col + size; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(size == 1){
            arr[row][col] = '*';
            return;
        }

        int newSize = size / 3;
        int count = 0;
        for(int i = row; i < row + size; i += newSize){
            for(int j = col; j < col + size; j += newSize) {
                count++;
                if(count == 5){
                    print(i,j,newSize,true);
                }else{
                    print(i,j,newSize,false);
                }
            }
        }
    }

}
