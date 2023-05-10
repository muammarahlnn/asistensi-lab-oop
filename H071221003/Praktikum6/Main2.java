public class Main2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000000, "Samsung");
        Car car = new Car(6, "Red", 200);
        
        smartphone.move();
        car.move();
    }
}
