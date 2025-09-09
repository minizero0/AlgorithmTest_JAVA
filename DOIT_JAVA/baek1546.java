package DOIT_JAVA;

import java.util.Arrays;
import java.util.Scanner;
public class baek1546 {

    public static int average(int n, int[] arr) {
        int result = 0;

        Arrays.stream(arr).sorted();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        int max = 0 ;
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum += (double) arr[i] / max * 100;
        }

        System.out.println(sum/n1);


    }
}
