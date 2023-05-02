package BakingDog.recursion;

public class exam01 {

    public static int func1(int n){
        if(n == 0) return 0;
        return n + func1(n-1);
    }

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(func1(10));
    }
}
