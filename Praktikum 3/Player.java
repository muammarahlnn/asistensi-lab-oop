// NO 2
public class Player {
    private String name;
    private int hp = 100;
    private int attackPower;
    private int defense;

    //konstruktor
    public Player() {}

    public void getDemage(Player enemy) {
        this.hp = this.hp-Math.abs(enemy.getAttackPower()-defense);
    }

    public Player(String nama, int Attack, int Defense) {
        name = nama;
        attackPower = Attack;
        defense = Defense;
    }

    public Player(String nama, int Defense) {
        name = nama;
        defense = Defense;

    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }
}
