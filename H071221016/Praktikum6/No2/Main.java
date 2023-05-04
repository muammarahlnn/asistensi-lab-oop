public class Main {
    public static void main(String[] args) {
        System.out.println("=".repeat(30));
        Alphard alphard = new Alphard();
        alphard.move();
        System.out.println("-".repeat(30));
        Vivo vivo = new Vivo();
        vivo.move();
        System.out.println("-".repeat(30));
        Pitbull pitbull = new Pitbull(0, 4);
        pitbull.move();
        System.out.println("-".repeat(30));
        pitbull.describe();
        System.out.println("=".repeat(30));
    }
    
}
