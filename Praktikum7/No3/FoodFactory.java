public class FoodFactory {
    public static Food getFood(String type) {
        if (type.equalsIgnoreCase("burger")) {
            return new Burger();
        } else if (type.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("steak")) {
            return new Steak();
        } else {
            throw new IllegalArgumentException("Invalid food type: " + type);
        }   
    }
}
