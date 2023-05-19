package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1983 {
    static double arr[];
    static String score[] = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            arr = new double[student];
            for(int i = 0; i < student; i++){
                st = new StringTokenizer(br.readLine());
                double sum = 0;
                for(int j = 0; j < 3; j++){
                    int num = Integer.parseInt(st.nextToken());
                    if(j == 0){
                        sum += num * 0.35;
                    }else if(j == 1){
                        sum += num * 0.45;
                    }else if(j == 2){
                        sum += num * 0.2;
                        arr[i] = sum;
                    }
                }
            }

            int c = student / 10;
            int count = 0;

            for(int i = 0; i < student; i++){
                if(arr[n-1] < arr[i]) count++;
            }
            System.out.println("#"+t+" "+score[count]);

        }
    }
}
