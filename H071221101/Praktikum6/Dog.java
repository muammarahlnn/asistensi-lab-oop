//3// Abstract class untuk Dog

interface Move{
    void move();   
}

abstract class Dog implements Move {
    protected int distance;
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    public void move() {
        position += distance;
    }

    abstract void describe();
}

// // Interface untuk Smartphone
// interface Smartphone {
//     public void move();
// }

// // Interface untuk Car
// interface Car {
//     public void move();
// }

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
        this.distance += 3;
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergeser ke : " + position);
    }
    @Override
    void describe() {
        System.out.println("Pitbull dikenal sebagai anjing yang seram.");
    }

}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
        this.distance =+ 2;
    }

    @Override
    void describe() {
        System.out.println("Siberian Husky adalah anjing paling dramaqueen.");
    }
    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky bergeser ke : " + position);
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
        this.distance =+ 1;
    }
    @Override
    void describe() {
        System.out.println("Bulldog bisa dibilang sebagai Pitbull versi mini.");
    }
    @Override
    public void move() {
        this.position += 1;
        System.out.println("Bulldog bergeser ke : " + position);
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
        this.distance =+ 3;
    }
    @Override
    void describe() {
        System.out.println("German Shepherds sering dijadikan anjing pelacak.");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("German Shepherd bergeser ke : " + position);
    }
}

class Smartphone implements Move{
    protected int price;
    protected String brand;

    public Smartphone (int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Move{
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void move() {
        System.out.println("Mobil sedang bergerak");
        
    }
}

public class Main{
    public static void main(String[] args) {
        System.out.println("\n");
        SiberianHusky siberianHusky = new SiberianHusky(0, 58);
        System.out.println("Posisi Siberian Husky : " + siberianHusky.position);
        siberianHusky.move();
        System.out.println("Panjang rata-rata : " + siberianHusky.averageLength);
        siberianHusky.describe();
        System.out.println("\n");

        Smartphone smartphone = new Smartphone(10000000, "Iphone 11");
        System.out.println("Nama Barang : " + smartphone.brand);
        System.out.println("Harga       : " + smartphone.price);
        smartphone.move();
        System.out.println("\n");

        Car car = new Car(6, "Putih", 325);
        System.out.println("Foward Gear : " + car.totalForwardGear);
        System.out.println("Warna Mobil : " + car.color);
        System.out.println("Top Speed   : " +car.maxSpeed);
        car.move();
    }
}