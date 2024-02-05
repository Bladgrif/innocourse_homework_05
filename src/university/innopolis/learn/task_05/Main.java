package university.innopolis.learn.task_05;

import university.innopolis.learn.task_01.Player;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Player> storage = new HashSet<>();
        storage.add(new Player(1, "Joe", true));
        storage.add(new Player(2, "Joe2", true));
        storage.add(new Player(3, "Joe3", true));
        storage.add(new Player(4, "Joe4", true));
        storage.add(new Player(5, "Joe5", true));
        storage.add(new Player(6, "Joe6", true));
        storage.add(new Player(7, "Joe7", true));
        storage.add(new Player(8, "Joe8", true));
        storage.add(new Player(9, "Joe9", true));
        storage.add(new Player(1, "Joe", true));  // duplicate, should be ignored

        for (Player player : storage) {
            System.out.println(player);
        }
    }
}
