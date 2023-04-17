package BakingDog;

//  알파벳 개수

//  알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class boj_10808 {

    public static int[] solution(String str){
        int[] answer = new int[26];
        for(int i = 0; i < str.length(); i++){
            answer[str.charAt(i)-'a']++;
        }

        for(int i = 0; i < answer.length; i++){
            if(i == answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i] + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
