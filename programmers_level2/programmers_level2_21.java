package programmers_level2;

//  주식가격
import java.util.Arrays;

public class programmers_level2_21 {
    public static int[] solution(int[] prices) {
        int arr[] = new int[prices.length];

        for(int i = 0; i < prices.length    ; i++){
            int count = 0;
            for(int j = i+1; j < prices.length; j++){
                count++;
                if(prices[j] < prices[i]) break;
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }
}