package out.production.AlgorithmTest_JAVA.Baekjoon.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj2606 {
    static int[][] computer;
    static boolean[] visit;
    static Queue<Integer> qu;
    static int count;
    static int N,M;

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

            computer[a][b] = computer[b][a] = 1;
        }

        bfs(1);
        System.out.println(count);
    }

    public static void bfs(int start) {
        qu = new LinkedList<>();

        visit[start] = true;
        qu.add(start);

        while (!qu.isEmpty()) {
            int temp = qu.poll();
            for (int i = 1; i < N + 1; i++) {
                if (computer[temp][i] == 1 && visit[i] == false) {
                    count++;
                    qu.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
