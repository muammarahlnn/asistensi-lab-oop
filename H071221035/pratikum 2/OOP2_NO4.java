class Cuboid {
    double height;
    double width;
    double length;
//METHOD
    double getVolume() {
        return height * width * length;
    }
}

public class OOP2_NO4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.width = 20;
        cuboid.length = 15;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
