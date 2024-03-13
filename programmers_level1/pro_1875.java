package programmers_level1;

import java.util.HashSet;

public class pro_1875 {
    public static int solution(int[] nums){
        HashSet<Integer> hash = new HashSet<>();

        for(int n : nums) hash.add(n);

        return Math.min(hash.size(), nums.length/2);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,3}));
        System.out.println(solution(new int[]{3,3,3,2,2,4}));
        System.out.println(solution(new int[]{3,3,3,2,2,2}));
    }
}
