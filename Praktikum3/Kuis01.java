class Hero {
    String name;
    int hp;
    int attackPoin;

    void attack() {
        System.out.println("Serang!");
    }
}

class Warrior extends Hero {
    void walk() {
        System.out.println("Zombie jalan-jalan");
    }
}

class Assassin extends Hero {
    void jump() {
        System.out.println("Loncat-loncat");
    }
}

class Mage extends Hero {
    void fly() {
        System.out.println("terbang");
    }

    void walk() {
        System.out.println("Zombie jalan-jalan");
    }

    void jump() {
        System.out.println("Loncat-loncat");
    }
}

public class Kuis01 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        warrior.walk();
    }
}