import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solution2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++){
            int N = Integer.parseInt(br.readLine());

            int plus[] = new int[21];
            int minus[] = new int[21];

            int count = 1;
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if(a == 1){
                    plus[b] = count++;
                }else if(a == -1){
                    minus[b] = count++;
                }
            }
            int max = 0;
            for(int i = minus.length-1; i > 0; i--){
                if(minus[i] == 0) continue;
                for(int j = i; j > 0; j--){
                    if(plus[j] == 0) continue;
                    if(i == j && minus[i] > plus[j]){
                        max = i;
                        break;
                    }
                }
                if(max != 0) break;
            }
            System.out.println("#"+tc+" "+max);
        }
        br.close();
    }
}
