package programmers_level0;
//          최빈값 구하기


import java.util.Arrays;

//       최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
//       최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
public class programmers_level0_33 {
    public static int solution(int[] array) {
        int answer[] = new int[1001];
        int max = -1;
        int maxNum = 0;
        for(int i = 0; i < array.length; i++) answer[array[i]]++;

        for(int i = 0; i < answer.length; i++){
            if(answer[i] > max){
                max = answer[i];
                maxNum = i;
            }
        }
        int temp = 0; // 여러 개인 지
        for(int j = 0; j < 1000; j++) {
            if(max == answer[j]) temp++;
            if(temp > 1) return -1;
        }
        return maxNum;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,2}));
    }
}
