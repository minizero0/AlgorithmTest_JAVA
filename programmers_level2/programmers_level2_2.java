package programmers_level2;
//          JadenCase 문자열 만들기


//  JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
//  단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
//  문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
public class programmers_level2_2 {

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.toLowerCase();
        String a[] = str.split(" ");
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("")) {
                sb.append(" ");
                System.out.println(sb.toString());
                continue;
            }
            char[] b = a[i].toCharArray();
            if(b[0] >= 'a' && b[0] <= 'z') {
                b[0] -= 32;
                a[i] = String.valueOf(b);
            }
            if(i == a.length - 1){
                sb.append(a[i]);
            }else sb.append(a[i] + " ");
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return sb.append(" ").toString();
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("   3people    unFollowed     me     "));
    }

}
