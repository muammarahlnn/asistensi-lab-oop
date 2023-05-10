import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Main2> product; //ArrayList<Product> product yang menampung objek-objek dari kelas Product dan hanya dapat diakses dari dalam kelas di mana variabel ini didefinisikan.

    public Store() {
    }

    public Store(String name, ArrayList<Main2> product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Main2> getProduct() {
        return product;
    }

    public void listProduct() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar produk:%n", this.getName());
        for (Main2 produk : this.product) {
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getName(), produk.getharga(), produk.getStock());
            i++;
        }
        System.out.println("0. Keluar");
    }

    public void addProduct(Main2 product){
        this.product.add(product);
    }

}