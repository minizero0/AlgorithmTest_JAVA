package DOIT_JAVA;


import java.util.Scanner;
public class baek11720 {

    public static int calcul(int num, String str){
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += Integer.parseInt(str.charAt(i)+"");
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =  Integer.parseInt(sc.next());
        String str = sc.next();

        sc.close();
        System.out.println(calcul(num1, str));
    }
}
