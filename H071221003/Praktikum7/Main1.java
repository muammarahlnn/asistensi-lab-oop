public class Main1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Nabila", 10);
        characters[1] = new Mage("Ika", 8);
        characters[2] = new Fighter("Alya", 15);
        characters[3] = new Fighter("Eva", 12);
        characters[4] = new Mage("Ty", 6);

        for (Character character : characters) {
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        System.out.println(character.getName() + " attacks with power " + character.attack());
    }
}
