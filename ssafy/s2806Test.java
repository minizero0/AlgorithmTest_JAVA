package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s2806Test {
    static int arr[];
    static int res,N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            res = 0;

            nQueen(0);

            System.out.println("#"+t+" "+res);
        }
    }

    private static void nQueen(int depth) {
        if(depth == N){
            res++;
            return;
        }

        for(int i = 0; i < N; i++){
            arr[depth] = i;
            if(possible(depth)) nQueen(depth+1);
        }
    }

    private static boolean possible(int depth) {
        for(int i = 0; i < depth; i++){
            if(arr[i] == arr[depth]) return false;
            else if(Math.abs(i-depth) == Math.abs(arr[i] - arr[depth])) return false;
        }
        return true;
    }
}
