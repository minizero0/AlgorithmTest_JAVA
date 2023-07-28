    package Baekjoon.Stack;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Stack;
    import java.util.StringTokenizer;

    public class boj10828 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            int N = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack();

            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                if(a.equals("push")){
                    stack.push(Integer.parseInt(st.nextToken()));
                }else if(a.equals("top")){
                    if(!stack.isEmpty()) System.out.println(stack.peek());
                    else System.out.println(-1);
                }else if(a.equals("size")){
                    System.out.println(stack.size());
                }else if(a.equals("empty")){
                    if(stack.empty() == true) System.out.println(1);
                    else System.out.println(0);
                }else if(a.equals("pop")){
                    if(!stack.isEmpty()) System.out.println(stack.pop());
                    else System.out.println(-1);
                }

            }
        }
    }
