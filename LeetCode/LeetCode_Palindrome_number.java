package LeetCode;

public class LeetCode_Palindrome_number {
    public static boolean isPalindrome(int x) {
        int num = x;
        int num2 = 0;
        while (x > 0) {
            num2 += x % 10;
            x /= 10;
            num2 *= 10;
        }
        System.out.println(num2/10);
        System.out.println(num/10);
        if(num2/10 != num) return false;
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }
}
