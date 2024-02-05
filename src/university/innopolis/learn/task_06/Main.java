package university.innopolis.learn.task_06;

import university.innopolis.learn.task_01.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();

        for (int i = 1; i < 11; i++) {
            points.put(new Player(i, "Player " + i, true), 0);
        }

        points.put(new Player(1, "Player 1", true), 1);
        points.put(new Player(2, "Player 2", true), 0);
        points.put(new Player(3, "Player 3", true), 0);
        points.put(new Player(4, "Player 4", true), 10);
        points.put(new Player(5, "Player 5", true), 0);
        points.put(new Player(6, "Player 6", true), 0);
        points.put(new Player(7, "Player 7", true), 12);
        points.put(new Player(8, "Player 8", true), 11);
        points.put(new Player(9, "Player 9", true), 13);
        points.put(new Player(10, "Player 10", true), 5);


        for (int i = 0; i < 3; i++) {
            Player winner = null;
            int maxScored = 0;
            int count = 0;

            for (Map.Entry<Player, Integer> map : points.entrySet()) {
                Player player = map.getKey();
                int scorePlayer = map.getValue();

                if (scorePlayer > maxScored) {
                    maxScored = scorePlayer;
                    winner = player;
                }
            }
            System.out.println(winner.getNickname() + " : " + maxScored);
            points.remove(winner); // Можно было сделать копию Map, что не изменять оригинал
        }

    }
}
