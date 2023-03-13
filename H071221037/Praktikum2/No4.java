class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}
public class No4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 20.00;
        cuboid.width = 20.00;
        cuboid.length = 11.25;
        
        System.out.printf("Volume = %.2f",cuboid.getVolume());
    }
}