package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2606_Two {
    static int[][] computer;
    static boolean[] visit;
    static int N, M, cnt;
    static Queue<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        computer = new int[101][101];
        visit = new boolean[101];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //인접행렬
            computer[a][b] = computer[b][a] = 1;
        }
        bfs(1);
        System.out.println(cnt);
    }

    public static void bfs(int start) {
        queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < N; i++) {
                if(computer[temp][i] == 1 && !visit[i]){
                    cnt++;
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }

    }
}
