package BakingDog.queue;

//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 여섯 가지이다.
//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class boj_10845 {
    static Queue queue = new LinkedList();
    String x = "";
    public void push(String n){
        queue.add(n);
        x = n;
    }
    public void pop(){
        if(queue.isEmpty()) System.out.println(-1);
        else System.out.println(queue.remove());
    }

    public void size(){
        System.out.println(queue.size());
    }

    public void empty(){
        if(queue.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }

    public void front(){
        if(!queue.isEmpty()) System.out.println(queue.peek());
        else System.out.println(-1);
    }

    public void back(){
        if(!queue.isEmpty()) System.out.println(x);
        else System.out.println(-1);
    }

    public static void main(String[] args) throws IOException {
        boj_10845 b = new boj_10845();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String str = br.readLine();

            if(str.equals("pop")){
                b.pop();
            }else if(str.equals("size")){
                b.size();
            }else if(str.equals("front")){
                b.front();
            }else if(str.equals("back")){
                b.back();
            }else if(str.contains("push")){
                b.push(str.substring(5));
            }else if(str.equals("empty")){
                b.empty();
            }
        }
    }
}
