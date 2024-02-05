package university.innopolis.learn.task_04;

import university.innopolis.learn.task_03.Movie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Company> companis = new ArrayList<>();
        companis.add(new Company("Sony", 2001, new Movie[3]));
        companis.add(new Company("Abba", 2005, new Movie[3]));
        companis.add(new Company("Nives", 2012, new Movie[3]));



        companis.get(0).setMovies(new Movie[]{
                new Movie("The Matrix", 9.7, "fantastic", "USA", true),
                new Movie("The Matrix 2", 9.8, "fantastic", "USA", true),
                new Movie("The Matrix 3", 9.9, "fantastic", "USA", true)
        });

        companis.get(1).setMovies(new Movie[]{
                new Movie("Lord of the Rings", 9.7, "fantastic", "USA", true),
                new Movie("Lord of the Rings 2", 9.8, "fantastic", "USA", true),
                new Movie("Lord of the Rings 3", 9.9, "fantastic", "USA", true)
        });

        companis.get(2).setMovies(new Movie[]{
                new Movie("Shrek", 9.7, "fantastic", "USA", true),
                new Movie("Shrek 2", 9.8, "fantastic", "USA", true),
                new Movie("Shrek 3", 9.9, "fantastic", "USA", true)
        });

        for (Company company : companis) {
            System.out.println(company);
        }
    }
}
