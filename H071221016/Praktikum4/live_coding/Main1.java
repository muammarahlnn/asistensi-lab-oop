package live_coding;

public class Main1 {
    public static void main(String[] args) {
        Song song = new Song();
        song.setAlbum("album1");
        song.setArtist("Maher Zein");
        song.setGenre("islami");
        song.setTitle("Rahmatun Lil'Alamin");
        song.setYear(2004);
        song.displayInfo();

        Song song2 = new Song("Barakallah","Maher Zein","Album2",2005,"Islami");
        System.out.println(song2.getTitle());
        System.out.println(song2.getArtist());
        System.out.println(song2.getAlbum());
        System.out.println(song2.getYear());
        System.out.println(song2.getGenre());
        SelfUtils.displaySelfData();

    }
  
    
}
