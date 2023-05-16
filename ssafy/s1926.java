package ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            int num = i;
            int count = 0;
            while(num > 2){
                if(num % 10 == 3 || num % 10 == 6 ||num % 10 == 9) count++;
                num /= 10;
            }
            if(count > 0){
                for(int k = 0; k < count; k++){
                    System.out.print("-");
                }
            }else{
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
