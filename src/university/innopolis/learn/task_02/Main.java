package university.innopolis.learn.task_02;

public class Main {
    public static void main(String[] args) {
        String [] list1 = {"get up", "eat","walk", "run", "sleep"};
        for (int i = 0; i < list1.length; i++) {
            System.out.println(String.format("Задача %d: %s", i+1, list1[i]));
        }
    }
}
