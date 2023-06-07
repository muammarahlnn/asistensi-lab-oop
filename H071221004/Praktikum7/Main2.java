import java.time.LocalDate;
public class Main2 {
    public static void main(String[] args) {
        // Buat instance dari tipe produk yang berbeda menggunakan konstruktor kelas Produk dengan tipe parameter yang berbeda
        System.out.println("\n" + "-".repeat(31) + " GARESTIA COMPANY " + "-".repeat(31));
        Product<Integer> product = new Product<>("History Supreme Yacht", 70000, LocalDate .of(2023, 05, 01));
        Product<Double> product2 = new Product<>("Antilia 2", 31000.0, LocalDate.of(2024, 5, 1));
        Product<String> product3 = new Product<>("'Garçon à la Pipe", "Rp 20000", LocalDate.of(2022, 12, 31));

        // Tampilkan detail setiap produk dengan memanggil getter masing-masing
        System.out.println("\nProduct 1: " + product.getName() + ", Price: " + product.getPrice()+ " juta" + ", Expiry Date: " + product.getExpiryDate());
        System.out.println("Product 2: " + product2.getName() + ", Price: " + product2.getPrice()+ " juta" + ", Expiry Date: " + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getName() + ", Price: " + product3.getPrice()+ " juta" + ", Expiry Date: " + product3.getExpiryDate() + "\n");
        System.out.println("=".repeat(80) + "\n");
    }
}
