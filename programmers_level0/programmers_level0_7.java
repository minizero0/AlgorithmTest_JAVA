package programmers_level0;
//        나이 출력

import java.util.Calendar;

//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
//나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
public class programmers_level0_7 {
    static Calendar calendar = Calendar.getInstance();         //캘린더를 생성
    public static int solution(int age) {
        int answer = 0;
        answer = calendar.getWeekYear() - age;                  //캘린더에서 현재 년도를 리턴하는 getWeekYear 호출 후 나이 빼기
        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution(40));
    }
}
