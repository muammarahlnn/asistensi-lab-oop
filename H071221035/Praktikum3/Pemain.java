package OOP3;
class player{

    private String name;
    private int hp;
    private int attackPower;
    private int defense;
    
    public player(){}
    
    public void getDamage(player enemy) {
    hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }
    public player(String name, int attackPower,int defense){
        this.name = name;
        this.hp = 100;
        this.defense = defense;
        this.attackPower = attackPower;
    }
    public player(String name, int defense){
        this.name = name;
        this.hp = 100;
        this.defense = defense;
    }
    
    
    public void status() {
    System.out.println(name + " status");
    System.out.println("HP = " + hp);
    System.out.println("Defense = " + defense);
    System.out.println("Attack = " + attackPower + "\n");
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    int getAttackPower() {
    return attackPower;
    }

}
public class Pemain {
    public static void main(String[] args) {
        player player1 = new player("Mino", 30, 15);
        player player2 = new player("Hilda", 10);
        player2.setAttackPower(35);
        player1.getDamage(player2);
        player1.status();
        player2.status();
    }
}
