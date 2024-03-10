package programmers_level1;

public class pro_134240 {
    public static String solution(int[] food) {
        String answer = "0";

        for(int i = food.length-1; i > 0; i--){
            int n = food[i] / 2;

            for(int j = 0; j < n; j++){
                answer = i + answer + i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 3, 4, 6}));
        System.out.println(solution(new int[] {1, 7, 1, 2}));
    }
}
