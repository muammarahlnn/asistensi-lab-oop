package login_app.models;

public class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;
    
    public Film() {
    }
    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void displayInfo(){
        System.out.println("\nJudul : " + title);
        System.out.println("Durasi : " + duration + " jam");
        System.out.println("Direktor : " + director);
        System.out.println("Genre : " + genre);
        System.out.println("Sinopsis : " + synopsis);
    }

    
}
