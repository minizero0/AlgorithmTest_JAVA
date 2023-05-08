package BakingDog.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9663Test {
    static int N;
    static int[] board;
    static int count = 0;
    

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N];
        nQueen(0);
        System.out.println(count);

    }

    static void nQueen(int depth){
        if(depth == N){
            count++;
            return;
        }

        for(int i = 0; i < N; i++){
            board[depth] = i;
            if(check(depth)){
                nQueen(depth+1);
            }
        }
    }

    static boolean check(int n){
        for(int i = 0; i < n; i++){
            if(board[n] == board[i])
                return false;
            else if(Math.abs(n - i) == Math.abs(board[n] - board[i]))
                return false;
        }
        return true;
    }
}
