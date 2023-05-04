public class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move() {
        this.position += 2;
        System.out.println("posisi " + position);
    }
    @Override
    void describe() {
     System.out.println("Siberian Husky dog life span : 12 years to 15 years");
    }
    
}
