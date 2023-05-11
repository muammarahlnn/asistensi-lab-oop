public class Main1 {
    public static void main(String[] args) {
        
        // mengisi nilai pada atribut
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Bubu", 10);
        characters[1] = new Mage("cifuu", 8);
        characters[2] = new Fighter("Koyu", 15);
        characters[3] = new Fighter("tory", 12);
        characters[4] = new Mage("Boty", 6);
 
        //looping untuk Menampilkan serangan karakter pada array
        for(int i = 0; i < characters.length; i++){
            characters[i].attack();

        }
        System.out.println();
        System.out.println("=".repeat(41));
        System.out.println("|" + " ".repeat(15) + "KARAKTER" + " ".repeat(15) + " |");
        System.out.println("=".repeat(41));
        // panggil static method 
        printAttack(characters[0]);
        printAttack(characters[1]);
        printAttack(characters[2]);
        printAttack(characters[3]);
        printAttack(characters[4]);
        System.out.println("=".repeat(41));
        System.out.println();
    }
    // Method untuk menampilkan hasil serangan karakter
    public static void printAttack(Character character) {
        System.out.println("\tNama \t\t: " + character.getName());
        System.out.println("\tAttack Power    : " + character.attack());
        System.out.println("\tattack type\t: " + character.attack("melee"));
        System.out.println("\tattack type\t: " + character.attack("ranged"));
        System.out.println("\tattack type\t: " + character.attack("frost"));
        System.out.println("\tattack type\t: " + character.attack("fire"));
        System.out.println();
       
    }
}




