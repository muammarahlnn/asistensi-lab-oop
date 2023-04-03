class Player{

    private String name;
    private int hp;
    private int attackPower;
    private int defense;
    
    public Player(){}
    
    public void getDamage(Player enemy) {
    hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }
    public Player(String name, int attackPower,int defense){
        this.name = name;
        this.hp = 100;
        this.defense = defense;
        this.attackPower = attackPower;
    }
    public Player(String name, int defense){
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
