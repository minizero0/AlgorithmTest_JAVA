package BakingDog.queue;

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_18258 {
    static Deque<Integer> queue = new LinkedList();
    static StringBuilder sb = new StringBuilder();
    public void push(int n){
        queue.add(n);
    }
    public int pop(){
        if(queue.isEmpty()) return -1;
        else return (int) queue.remove();
    }

    public int size(){
        return queue.size();
    }

    public int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }

    public int front(){
        if(!queue.isEmpty()) return (int) queue.peek();
        else return -1;
    }

    public int back(){
        if(!queue.isEmpty()) return (int) queue.peekLast();
        else return -1;
    }

    public static void main(String[] args) throws IOException {
        boj_18258 b = new boj_18258();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if(str.equals("pop")){
                sb.append(b.pop()).append("\n");
            }else if(str.equals("size")){
                sb.append(b.size()).append("\n");
            }else if(str.equals("front")){
                sb.append(b.front()).append("\n");
            }else if(str.equals("back")){
                sb.append(b.back()).append("\n");
            }else if(str.contains("push")){
                b.push(Integer.parseInt(str.substring(5)));
            }else if(str.equals("empty")){
                sb.append(b.empty()).append("\n");
            }
        }
        System.out.println(sb);
    }
}

