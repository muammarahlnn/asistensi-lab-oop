package live_coding;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int year;
    private String genre;
    
    public Song(String title, String artist, String album, int year, String genre) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.year = year;
        this.genre = genre;
    }
    public Song() {

    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void displayInfo() {
        System.out.println(title);
        System.out.println(artist);
        System.out.println(album);
        System.out.println(year);
        System.out.println(genre);

    }
    
    
    
}
