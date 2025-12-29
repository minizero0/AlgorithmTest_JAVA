package programmers_level1;

public class pro_유연근무제 {
    public static int toMinute(int time){
        int hour = time / 100;
        int minute = time % 100;

        return hour * 60 + minute;
    }

    public static int solution (int[] schedules, int[][] timelogs, int startday){
        int count = 0;
        for (int i = 0; i < schedules.length; i++) {
            int startTime = toMinute(schedules[i]);

            boolean flag = true;
            for (int j = 0; j < timelogs[i].length; j++) {
                int day = (startday + j - 1) % 7 + 1;

                if (day == 6 || day == 7) {
                    continue;
                }
                day++;
                int lastTime = toMinute(timelogs[i][j]);
                if(lastTime - startTime > 10){
//                    System.out.println("i : " +  startTime + " : i,j : " + lastTime);
                    flag = false;
                    break;
                }
            }
            if (flag) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] schedules = {730, 855, 700, 720};

        int[][] timelogs = {
                {710, 700, 650, 735, 700, 931, 912},
                {908, 901, 805, 815, 800, 831, 835},
                {705, 701, 702, 705, 710, 710, 711},
                {707, 731, 859, 913, 934, 931, 905}
        };

        int startday = 1;

        int result = solution(schedules, timelogs, startday);
        System.out.println(result);
    }
}
