package programmers_level1;
//        최대공약수와 최소공배수


import java.util.Arrays;

//  두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
//  배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//  예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

//유클리드 호제법을 재귀로 활용하여 최소공배수, 최대공약수를 찾음
public class programmers_level1_27 {
    static int educ(int a, int b){
        int r = a % b;         //큰 숫자를 작은 수로 나눈 나머지 계산
        if(r == 0) return b;   //나머지가 0이면 작은숫자가 최대공약수 이므로 리턴
        else return educ(b, r);//나머지가 0이 아니면 재귀로 리턴
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int r = educ(Math.max(n,m), Math.min(n,m));

        answer[0] = r;
        n = n/r;
        m = m/r;
        answer[1] = n * m * r;   // 두 수의 최소공배수 = 두 수의 최대 공약수 * 위에서 구한 몫
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
    }
}
