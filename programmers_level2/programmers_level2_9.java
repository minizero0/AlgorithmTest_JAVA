package programmers_level2;
//          다음 큰 숫자


//  자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//  조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//  조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//  조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
//  예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
//  자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

public class programmers_level2_9 {
    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1') answer++;
        }

        for(int i = n+1; i < 1000000; i++){
            String a = Integer.toBinaryString(i);
            int cnt = 0;
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) == '1') cnt++;
            }
            if(cnt == answer){
                return i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(78));
    }
}