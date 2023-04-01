package programmers_level2;
//          괄호 회전하기

//  다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
//  (), [], {} 는 모두 올바른 괄호 문자열입니다.
//  만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
//  만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
//  대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다. 이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때
//  s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.


import java.util.Stack;

public class programmers_level2_18 {
    public static boolean isTrue(StringBuilder sb){
        Stack<Character> stack = new Stack<>();
        if(sb.charAt(0) == ']' || sb.charAt(0) == '}' || sb.charAt(0) == ')') return false;
        for(int i = 0; i < sb.length(); i++){
            if(stack.isEmpty()){
                stack.push(sb.charAt(i));
            }else{
                if(sb.charAt(i)==']'){
                    if(stack.peek() == '[') stack.pop();
                    else stack.push(sb.charAt(i));
                }else if(sb.charAt(i) == '}'){
                    if(stack.peek() == '{') stack.pop();
                    else stack.push(sb.charAt(i));
                }else if(sb.charAt(i) == ')'){
                    if(stack.peek() == '(') stack.pop();
                    else stack.push(sb.charAt(i));
                }else stack.push(sb.charAt(i));
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

    public static int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            if(isTrue(sb)) answer++;
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));

    }
}