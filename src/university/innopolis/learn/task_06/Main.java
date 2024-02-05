package university.innopolis.learn.task_06;

import university.innopolis.learn.task_01.Player;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();
        points.put(new Player(1, "Joe", true), 1);
        points.put(new Player(2, "Joe2", true), 0);
        points.put(new Player(3, "Joe3", true), 0);
        points.put(new Player(4, "Joe4", true), 10);
        points.put(new Player(5, "Joe5", true), 0);
        points.put(new Player(6, "Joe6", true), 0);
        points.put(new Player(7, "Joe7", true), 12);
        points.put(new Player(8, "Joe8", true), 11);
        points.put(new Player(9, "Joe9", true), 13);
        points.put(new Player(10, "Joe10", true), 5);


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
