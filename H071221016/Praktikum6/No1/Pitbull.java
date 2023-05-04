public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move() {
        this.position += 3;
        System.out.println("pitbull berada di posisi  " + position);
    }
    @Override
    void describe() {
    System.out.println("Very Strong");
    }
   
}
