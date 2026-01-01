package programmers_level1;

public class pro_콜라츠추측 {
    public static int solution(int n) {
        int count = 0;
        long num = n;
        if(num == 1) return 0;

        while (num != 1) {
            count++;
            if(count == 500) return -1;

            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
