package university.innopolis.learn.task_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> films = new ArrayList<>();
        films.add(new Movie("Star Wars", 9.7,"Fantastic", "USA",true));
        films.add(new Movie("Star Wars 2", 9.8,"Fantastic", "USA",true));
        films.add(new Movie("Star Wars 3", 9.9,"Fantastic", "USA",true));
//        System.out.println(films.get(1));
        System.out.println(films.get(1).getTitle());
        System.out.println(films.get(1).getCountry());
        System.out.println(films.get(1).getGenre());
        System.out.println(films.get(1).getRating());
        System.out.println(films.get(1).getThereAnOscar());

    }
}
