public class Product {
    //atribut class product
    String name;
    int price, stock;
    //constructor dengan parameter string nama produk, integer harga, dan stok
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //constructor dengan parameter integer stok, string nama dan harga
    //replace berguna untuk mengganti atau menguba beberapa karakter lama menjadi karakter baru
    public Product(String name, String price, int stock) {
        this.name = name;
        price = price.replace("k", "000").replace("K", "000");
        //integer.parseint untuk mengubah nilai string price menjadi tipe data integer kemudian disimpaan dalam variabel numprice
        Integer numPrice = Integer.parseInt(price);
        this.price = numPrice;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //behaviour untuk mengurangi stok sebanyak satu jika produk terjual
    public int jualProduk() {
        this.stock--;
        return this.stock;
    }
}
