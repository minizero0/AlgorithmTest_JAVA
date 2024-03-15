package programmers_level1;

import java.util.*;

public class pro_12915 {
    public static String[] solution(String[] strings, int n) {
        List<String> list = new ArrayList<>();

        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }

        Collections.sort(list);         //list 정렬

        for(int i = 0; i < list.size(); i++){
            strings[i] = list.get(i).substring(1);
        }

        
        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"sun", "bed", "car"}, 1)));
    }
}
