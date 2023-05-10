interface Moveable {
    void move();
}

public abstract class Product {
    int price;
    String brand;
    
    public Product (int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
}

class Smartphone extends Product implements Moveable {
    public Smartphone(int price, String brand) {
        super(price, brand);
    }
    
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Moveable {
    int totalForwardGear;
    String color;
    int maxSpeed;
    
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

