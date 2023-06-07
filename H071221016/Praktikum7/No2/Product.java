/*Nur Amalia
 * H071221016
 */

import java.time.LocalDate;
public class Product<T> {
    String name;
    T price;
    LocalDate expiryDate;
   
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
