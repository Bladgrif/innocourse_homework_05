package university.innopolis.learn.task_03;


public class Movie {
    private String title;
    private Double rating;
    private String genre;
    private String country;
    private Boolean isThereAnOscar;

    public Movie(String title, Double rating, String genre, String country, Boolean isThereAnOscar) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isThereAnOscar = isThereAnOscar;
    }

    @Override
    public String toString() {
        return title ;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public Boolean getThereAnOscar() {
        return isThereAnOscar;
    }
}
