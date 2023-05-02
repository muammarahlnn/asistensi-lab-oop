// Abstract class untuk Dog
abstract class Dog {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public abstract void describe();

    public void move() {
        this.position += getMoveDistance();
    }

    protected abstract int getMoveDistance();
}

// Interface untuk moveable object
interface Moveable {
    void move();
}
// Class Pitbull
class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    public void describe() {
        System.out.println("Pitbull memiliki badan kuat dan wajah yang menyeramkan.");
    }

    protected int getMoveDistance() {
        return 3;
    }
}

// Class Siberian Husky
class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    public void describe() {
        System.out.println("Siberian Husky anjing yang paling random sedunia.");
    }

    protected int getMoveDistance() {
        return 2;
    }
}

// Class Bulldog
class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    public void describe() {
        System.out.println("Bulldog memiliki wajah yang lucu dan tubuh yang pendek dan gemuk.");
    }

    protected int getMoveDistance() {
        return 1;
    }
}

// Class German Shepherd
class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    public void describe() {
        System.out.println(
                "German Shepherd adalah anjing peliharaan yang populer karena kecerdasannya dan loyalitasnya.");
    }

    protected int getMoveDistance() {
        return 3;
    }
}

// Class Smartphone
class Smartphone implements Moveable {
    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public void move() {
        System.out.println("Smartphone berpindah.");
    }
}

// Class Car
class Car implements Moveable {
    protected int totalFowardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalFowardGear, String color, int maxSpeed) {
        this.totalFowardGear = totalFowardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        System.out.println("Mobil sedang berakselerasi.");
    }
}

