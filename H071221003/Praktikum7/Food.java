import java.util.List;
interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 25000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 75000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 100000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        switch(type) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                throw new IllegalArgumentException("Invalid food type: " + type);
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for(Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}