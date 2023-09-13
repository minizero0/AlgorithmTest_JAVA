package out.production.AlgorithmTest_JAVA.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1789 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long sum = 0;
        int count = 0;

        for (int i = 1; ; i++) {
            if (sum > N) break;
            sum += i;
            count++;
        }
        System.out.println(count - 1);
    }
}
