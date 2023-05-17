package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1244Test {
    static String[] arr;
    static int chance,max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());
            arr = st.nextToken().split("");
            chance = Integer.parseInt(st.nextToken());

            if(arr.length < chance) chance = arr.length;

            max = 0;

            dfs(0,0);
            System.out.println("#"+t+" "+max);
        }
    }

    private static void dfs(int start, int cnt) {
        if(chance == cnt){
            String result = "";
            for(String s : arr){
                result += s;
            }
            max = Math.max(max, Integer.parseInt(result));
            return;
        }

        for(int i = start; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i, cnt+1);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
    }
}
