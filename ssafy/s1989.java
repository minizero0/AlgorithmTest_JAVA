package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            int res = 1;
            String str = br.readLine();
            for(int i = 0; i < str.length()/2; i++){
                if(str.charAt(i) == str.charAt(str.length()-(i+1))) continue;
                else res = 0;
            }
            System.out.println("#"+t+" "+res);
        }
    }
}
