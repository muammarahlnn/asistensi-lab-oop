public class Product {
    // Attribute
    private String name;
    private int price;
    private int stock;
    // Constructor
    public Product(String name,int price,int stock ) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String price, int stock) {
        this.name = name;
        if (price.contains("k")) {
            this.price = Integer.parseInt(price.replaceAll("k", "")) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
        this.stock = stock;
    }
     // Getter untuk masing-masing atribut
     public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void reduceStock() {
        this.stock--;
    }
}
