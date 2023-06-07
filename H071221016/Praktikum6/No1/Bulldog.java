public class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move() {
        this.position +=1;
        System.out.println("posisi " + position);
    }
    @Override
    void describe() {
    System.out.println("Telinganya berbentuk mawar, kecil, dan tipis");
    }
    
}
