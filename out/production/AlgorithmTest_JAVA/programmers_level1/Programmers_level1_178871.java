package out.production.AlgorithmTest_JAVA.programmers_level1;

import java.util.Arrays;
import java.util.HashMap;

public class Programmers_level1_178871 {
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> mapForPlayer = new HashMap<>();
        HashMap<Integer, String> mapForRank = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            mapForPlayer.put(players[i], i);
            mapForRank.put(i, players[i]);
        }

        for(int i = 0; i < callings.length; i++){
            int rankCurrent = mapForPlayer.get(callings[i]);
            String player = mapForRank.get(rankCurrent);

            String frontPlyer = mapForRank.get(rankCurrent - 1);

            mapForPlayer.put(player, rankCurrent - 1);
            mapForRank.put(rankCurrent - 1, player);

            mapForPlayer.put(frontPlyer, rankCurrent);
            mapForRank.put(rankCurrent, frontPlyer);

        }
        for(int i = 0; i < mapForPlayer.size(); i++){
            answer[i] = mapForRank.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})));
    }
}
