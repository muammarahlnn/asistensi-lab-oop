public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 0);
        pitbull.describe();
        pitbull.move();
        System.out.println("Pitbull berada di posisi " + pitbull.getPositionIncrement());

        SiberianHusky siberianHusky = new SiberianHusky(0, 0);
        siberianHusky.describe();
        siberianHusky.move();
        System.out.println("Siberian Husky berada di posisi " + siberianHusky.getPositionIncrement());

        Bulldog bulldog = new Bulldog(0, 0);
        bulldog.describe();
        bulldog.move();
        System.out.println("Bulldog berada di posisi " + bulldog.getPositionIncrement());

        GermanShepherd germanShepherd = new GermanShepherd(0, 0);
        germanShepherd.describe();
        germanShepherd.move();
        System.out.println("German Shepherd berada di posisi " + germanShepherd.getPositionIncrement());
    }
}
