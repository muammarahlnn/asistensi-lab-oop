public class Book {
    // attribut
    public String title;
    public String author;
    public int yearPublished;

    //user defined variable
    Publisher bookPublisher;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public void setBookPublisher(Publisher bookPublisher){
        this.bookPublisher = bookPublisher;
    }
    public Publisher getBookPublisher(){
        return bookPublisher;
    }
    // kostruktor 1
    public Book(String title, String author, int yearPublished, Publisher bookPublisher) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.bookPublisher = bookPublisher;
    }

    // konstruktor 2
    public Book(String title, Publisher bookPublisher) {
        this(title, "unknown author", 2022, bookPublisher);
    }

    // behavior 1
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Publisher dan Alamat : " + bookPublisher.getPublisherAlamat());
    }

    // behavior 2
    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
}