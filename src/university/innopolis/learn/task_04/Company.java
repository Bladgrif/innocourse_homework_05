package university.innopolis.learn.task_04;

import university.innopolis.learn.task_03.Movie;

import java.util.Arrays;
import java.util.Objects;

public class Company {

    private String title;
    private int date;
    private Movie[] movies;

    public Company(String title, int date, Movie[] movies) {
        this.title = title;
        this.date = date;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return title
//                + ":" + Arrays.toString(movies) +
                + " : " + Arrays.toString(movies) ;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
}
