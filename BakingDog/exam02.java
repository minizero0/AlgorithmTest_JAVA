package BakingDog;

import java.util.Arrays;

public class exam02 {

    public static int func2(int[] arr, int n){
        int answer = 0;
        int[] occur = new int[101];
        for(int i = 0; i < n; i++){
            if(occur[100 - arr[i]] == 1)
                answer++;
            else
                occur[arr[i]]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(func2(new int[] {1,52,48},3));
        System.out.println(func2(new int[] {50,42},2));
        System.out.println(func2(new int[] {4,13,67,87},4));
    }
}
