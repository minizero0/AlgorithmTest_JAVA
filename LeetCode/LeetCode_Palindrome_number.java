package LeetCode;

public class LeetCode_Palindrome_number {
    public static boolean isPalindrome(int x) {
        String s = x + "";
        int start =  0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}
