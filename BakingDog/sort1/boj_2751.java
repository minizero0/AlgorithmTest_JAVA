package BakingDog.sort1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class boj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++){
            bw.write(arr.get(i)+"\n");
        }
        bw.flush();
    }
}
