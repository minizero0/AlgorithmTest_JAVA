package BakingDog.recursion;

public class fibo {

    public static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo(n-2) + fibo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(10));
    }
}
