package programmers_level1;


import java.util.Arrays;

public class pro_42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int pick = commands[i][2] - 1;
            int[] command_array = new int[end - start + 1];
            int n = 0;

            for(int j = start; j <= end; j++){
                command_array[n++] = array[j];
            }

            Arrays.sort(command_array);

            System.out.println(Arrays.toString(command_array));
            if(start == end) answer[i] = array[start];
            else answer[i] = command_array[pick];
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3},{4, 4, 1},{1, 7, 3}})));
    }
}
