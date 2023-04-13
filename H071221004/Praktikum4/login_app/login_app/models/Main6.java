package login_app.models;

public class Main6 {
    public static void main(String[] args) {
        
        Film film = new Film();
        film.setTitle("Harry Potter");
        film.setDuration(2);
        film.setDirector("JK.Rowling");
        film.setGenre("Fantasi");
        film.setSynopsis("Kisah seorang anak penyihir bernama Harry Potter \nyang mencari jati dirinya sebagai legenda penyihir di sekolah sihir Hogwarts");
        film.displayInfo();

        Film film2 = new Film("Transformers", 2, "Rahmatia", "Action", "Kisah robot dari dunia lain yang terdampar kebumi karna \nperkelahian sesama robot yang haus akan kekuasaan");
        System.out.println("\nJudul : " + film2.getTitle());
        System.out.println("Duration : " + film2.getDuration() + " jam");
        System.out.println("Director : " + film2.getDirector());
        System.out.println("Genre : " + film2.getGenre());
        System.out.println("Sinopsis : " + film2.getSynopsis());

        SelfUtils6.displayData();

    }
}
