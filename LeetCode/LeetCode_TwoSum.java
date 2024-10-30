package LeetCode;

import java.util.Arrays;

public class LeetCode_TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }
}
