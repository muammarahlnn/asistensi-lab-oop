import java.util.ArrayList;
// Atribut
public class Store {
    private String name;
    private ArrayList<Product> product;
    // construktor
    public Store(String name) {
        this.name = name;
        this.product = new ArrayList<Product>();
    }
    public String getName() {
        return name;
    } 
    public ArrayList<Product> getProduct() {
        return product;
    }
    // Behavior
    public void addProduct(Product product) {
        this.product.add(product);
    }
    public void listProduct() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar produk:%n", this.getName());
        for (Product produk : this.product) {
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getName(), produk.getPrice(), produk.getStock());
            i++;
        }
        System.out.println("0. Keluar");
    }

}



