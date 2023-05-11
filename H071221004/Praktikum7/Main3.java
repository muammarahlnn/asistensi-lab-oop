import java.util.List;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        //instance nilai typeFood
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        //untuk menampilkan detail pembayaran (opsi)
        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(15) + "PEMBAYARAN");
        System.out.println(" ".repeat(14) + "-".repeat(12));
        System.out.println("\n\t  Harga Burger : Rp" + burger.getPrice() );
        System.out.println("\t  Harga Pizza  : Rp" + pizza.getPrice() );
        System.out.println("\t  Harga Steak  : Rp" + steak.getPrice() + "\n");

        // ketiga objek Food tersebut dimasukkan ke dalam sebuah ArrayList dengan nama foods
        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        //objek food kemudian dimasukkan kedalam method calculateTotal di class restaurant utnuk dototalkan harga krtiga objek tersebut
        int total = Restaurant.calculateTotal(foods);

        //menampilkan hasil perhitungan harga
        System.out.println("=".repeat(40));
        System.out.println("Total Price :\t\t\tRp" + total);
        System.out.println("=".repeat(40));
        System.out.println();
    }
}

