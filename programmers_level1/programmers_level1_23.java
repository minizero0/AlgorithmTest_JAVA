package programmers_level1;
//        문자열 다루기 기본

//  문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
//  solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
public class programmers_level1_23 {
    public static boolean solution(String s) {
        char[] arr = s.toCharArray();
        if(arr.length != 4 && arr.length != 6) return false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 57) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("234"));
    }
}
