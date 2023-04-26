package BakingDog.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class boj_1926Test {
    static Queue<Pair> qu;

    public static void main(String[] args) {
        qu = new LinkedList<>();
        qu.offer(new Pair(1,2));
        Pair p = qu.poll();
        System.out.println(p.x + " " + p.y);
    }


    public static class Pair{
        int x,y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
