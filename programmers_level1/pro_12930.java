package programmers_level1;

public class pro_12930 {

    public static String solution(String s) {
        StringBuffer answer = new StringBuffer();

        String[] str = s.split(" ", -1);

        for(int i = 0; i < str.length; i++){
            char[] charArr = str[i].toCharArray();
            for(int j = 0; j < charArr.length; j++){
                if(j % 2 == 0) charArr[j] = Character.toUpperCase(charArr[j]);
                else charArr[j] = Character.toLowerCase(charArr[j]);
            }
            if(i != str.length - 1) answer.append(charArr).append(" ");
            else answer.append(charArr);
        }
        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
