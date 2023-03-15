package programmers_level0;
//          짝수 홀수 개수

//        정수가 담긴 리스트 num_list가 주어질 때,
//        num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
public class programmers_level0_22 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 ==0){
                answer[0]++;
            }else
                answer[1]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));

    }
}
