abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);
}

class Fighter extends Character {
    protected int attackPower;

    Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    int attack() {
        return attackPower;
    }

    int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    protected int attackPower;

    Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    int attack() {
        return attackPower;
    }

    int attack(String attackType) {
        if (attackType.equals("fire")) {
            return attackPower * 3;
        } else if (attackType.equals("frost")) {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class Chara {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Fighter1", 10);
        characters[1] = new Mage("Mage1", 20);
        characters[2] = new Fighter("Fighter2", 15);
        characters[3] = new Fighter("Fighter3", 20);
        characters[4] = new Mage("Mage2", 30);

        for (Character p : characters) {
            printAttack(p);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Attack Power: " + character.attack());

        if (character instanceof Fighter){
            System.out.println("Melee Attack Power: " + character.attack("melee"));
            System.out.println("Ranged Attack Power: " + character.attack("ranged"));
        } else if (character instanceof Mage){
    
            System.out.println("Frost Attack Power: " + character.attack("frost"));
            System.out.println("Fire Attack Power: " + character.attack("fire"));
        }
        System.out.println();
    }
}