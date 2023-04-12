public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Asoka Aksara", "Indonesia");
        // buat objek buku menggunakan konstruktor 1
        Book book1 = new Book("Tia in The Jungle", "Rahmat", 2022, publisher);
        System.out.println("Book 1:");
        book1.displayBookInfo();
        book1.changeAuthor("Rahmatu");
        System.out.println("After changing the author name:");
        book1.displayBookInfo();

        // buat objek buku menggunakan konstruktor 2
        Book book2 = new Book("Alyah The Explorer", publisher);
        System.out.println("\nBook 2:");
        book2.displayBookInfo();
        book2.changeAuthor("Alyah");
        System.out.println("After changing the author name:");
        book2.displayBookInfo();
    }
}