public class Main1 {
    public static void main(String[] args) {
       SiberianHusky SiberianHusky = new SiberianHusky(11, 60);
       System.out.println("\n" + "=".repeat(120));
       SiberianHusky.describe();
       System.out.println("-".repeat(21));
       System.out.printf("| Posisi awal : %d  |\n", SiberianHusky.position);
       SiberianHusky.move();
       System.out.println("-".repeat(21));
       System.out.println("=".repeat(120));

        Smartphone smartphone = new Smartphone(4_000_000, "Samsung");
        smartphone.move();
        System.out.println("-".repeat(37));
        System.out.println("| Brand : " + smartphone.brand);
        System.out.println("| Harga : " + smartphone.price);
        System.out.println("-".repeat(37));
        System.out.println("=".repeat(120));

        Car car = new Car(4, "White", 180);
        car.move();
        System.out.println("-".repeat(37));
        System.out.println("| Total Forward Gear    : " + car.totalForwardGear);
        System.out.println("| Color \t\t: " + car.color);
        System.out.printf("| Max Speed \t\t: %d km/jam\n", car.maxSpeed);
        System.out.println("-".repeat(37));
        System.out.println("=".repeat(120) + "\n");
    }
}
