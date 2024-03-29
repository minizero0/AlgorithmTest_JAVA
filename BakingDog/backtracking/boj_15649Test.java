package BakingDog.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_15649Test {
    static int N, M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visit = new boolean[N];
        arr = new int[M];

        dfs(N,M,0);
        System.out.println(sb);
    }

    static void dfs(int N, int M, int depth){
        if(M == depth){
            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i+1;
                dfs(N,M,depth+1);
                visit[i] = false;
            }
        }

    }
}
