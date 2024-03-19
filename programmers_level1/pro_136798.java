package programmers_level1;

import java.util.ArrayList;
import java.util.List;

public class pro_136798 {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        int[] arr = new int[number + 1];

        for (int i = 1; i <= number; i++) {
            arr[i] = i;
            int n = 0;

            for (int j = 1; j * j <= arr[i]; j++) {
                if(j*j == arr[i]) n++;
                else if(arr[i] % j == 0) n += 2;
                if (n > limit) {
                    n = power;
                    break;
                }
            }
            answer += n;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }
}
