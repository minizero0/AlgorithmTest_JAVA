package programmers_level1;
//        정수 제곱근 판별

//  임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//  n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
//  n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

public class programmers_level1_8 {
    public static long solution(long n) {
        long answer = -1;
        long num = (long)Math.floor((Math.sqrt(n)));
        if(num * num == n){
            return (num+1) * (num+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(9));
    }
}
