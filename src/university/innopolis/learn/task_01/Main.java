package university.innopolis.learn.task_01;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player(001, "Joe", true);
        Player player2 = new Player(001, "Joe", true);
        System.out.println(player1==player2);
        System.out.println(player1.equals(player2));
    }
}
