public class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move() {
        this.position += 3; 
        System.out.println("posisi " + position);       
    }
    @Override
    void describe() {
    System.out.println("Mata berwarna gelap dan berbentuk almond.");
    }    
}
