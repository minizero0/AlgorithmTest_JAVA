package programmers_level1;

public class pro_소수만들기 {
    private static boolean getPrime(int num) {
        if(num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(getPrime(nums[i] + nums[j] + nums[k])) count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
    }
}
