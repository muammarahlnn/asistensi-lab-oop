import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice(); //interface tidak menerima attribute
}

class Burger implements Food {
    protected int price;

    public Burger(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    protected int price;

    public Pizza(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    protected int price;

    public Steak(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        switch (type.toLowerCase()) {
            case "burger":
                return new Burger(10000);
            case "pizza":
                return new Pizza(120000);
            case "steak":
                return new Steak(65000);
            default:
                throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;

        for (Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

public class NO3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>(); //brp byk pun panjangnya // instance dalam bentuk array list0
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);
        System.out.println("Total harga : " + total);
    }
}