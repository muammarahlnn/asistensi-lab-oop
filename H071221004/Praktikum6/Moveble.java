interface Moveble {
    void move();
}

class Smartphone implements Moveble {
    int price;
    String brand;

    public Smartphone() {
    }
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move(){
        System.out.println("\nSmartPhone berpindah...");
    }
}

class Car implements Moveble {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car() {
    }
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println("\nMobil sedang berakselerasi...");
    }
}




