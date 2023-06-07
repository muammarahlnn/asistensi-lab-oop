import java.util.List;
// interface food yang diwarisi oleh class burger, pizza, dan steak
interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 50000;

    //method getPrice yang mengembalikan nilai price
    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 75000;

    //method getPrice yang mengembalikan nilai price
    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 100000;

    //method getPrice yang mengembalikan nilai price
    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    //static method yang memiliki parameter bertipe data String yang dapat mengembalikan objek bertipe Food 
    public static Food getFood(String type) {
        if(type.equalsIgnoreCase("burger")){
            return new Burger();
        }else if(type.equalsIgnoreCase("pizza")){
            return new Pizza();
        }else if(type.equalsIgnoreCase("steak")){
            return new Steak();
        }else{
            throw new IllegalArgumentException("Invalid food type: " + type); 
        }
                // throw new IllegalArgumentException("Invalid food type: " + type);
        }
        
    }

//method  yang menerima sebuah parameter bertipe List yang berisi objek-objek Food, 
//dan mengembalikan jumlah total harga dari semua objek Food yang ada di dalam List 
class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        //menggunkan for each untuk memeriksa semua data dalam list
        for(Food food : foods) {
            total += food.getPrice();
        }
        return total;
    }
}

