package DOIT_JAVA;

import java.util.Scanner;
import java.util.StringTokenizer;

public class baek11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        int n = sc.nextInt();
        int n2 = sc.nextInt();

        sc.nextLine();

        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int arr[] = new int[st.countTokens()+1];


        arr[0] = 0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1] + Integer.parseInt(st.nextToken());
        }


        int hab1 = 0;
        int hab2 = 0;

        for (int j = 0; j < n2; j++) {
            result = 0;
            hab1 = sc.nextInt();
            hab2 = sc.nextInt();

            result = arr[hab2] - arr[hab1-1];
            System.out.println(result);

        }
    }
}
