package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int t = 1; t <= N; t++){
            int sum = 0;
            int num = Integer.parseInt(br.readLine());
            for(int i = 1; i <= num; i++){
                if(i % 2 == 0) sum -= i;
                else sum += i;
            }
            System.out.println("#"+t+" "+sum);
        }
    }
}
