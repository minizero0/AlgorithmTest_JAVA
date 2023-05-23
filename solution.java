import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());


        for(int tc = 1; tc <= T; tc++){
            int res = 0, max = 0;
            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (a > max) {
                    max = a + b;
                    res++;
                }
            }
            System.out.println("#"+tc+" "+res);
        }
        br.close();
    }
}