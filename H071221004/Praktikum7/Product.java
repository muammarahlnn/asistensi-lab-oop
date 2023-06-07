import java.time.LocalDate;
//kelas generik Product yang memiliki tiga atribut: name, price, dan expiryDate
public class Product<T> {
    private String name;
    private T price; //price merupakan harga produk bertipe data generik T
    private LocalDate expiryDate; //representasi tanggal mencakup hari, bulan, tahun

    //constructor untuk menginisialisasikan nilai nilai atribut
    public Product(String name, T price, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}
