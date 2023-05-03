package BakingDog.recursion;

public class exam02 {

    public static int recur(int n){
        if(n == 0) return 0;
        return n + recur(n-1);
    }

    public static void main(String[] args) {
        System.out.println(recur(10));
    }
}
