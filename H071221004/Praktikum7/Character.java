//class charakter dengan atribut name
public abstract class Character {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //method abstrack attack yang akan langsung me return nilai attackPower
    abstract int attack();
    //method abstrack dengan parameter string attackType
    abstract int attack(String attackType);
}

class Fighter extends Character{
    private int attackPower;

    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower= attackPower;
    }

    @Override
    public int attack(){
        return this.attackPower;
    }
    //method abstrack yang mereturn nilai attackPower berdaasarkan tipe attack
    @Override
    public int attack(String attackType){
        if (attackType.equals("melee")){
            return this.attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return this.attackPower;
        } else {
            return 0;
        }
    }

}

class Mage extends Character{
    private int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower= attackPower;
    }

    @Override
    public int attack(){
        return this.attackPower;
    }
    //method abstrack yang mereturn nilai attackPower berdaasarkan tipe attack
    @Override
    public int attack(String attackType){
        if (attackType.equals("frost")){
            return this.attackPower * 2;
        } else if (attackType.equals("fire")) {
            return this.attackPower * 3;
        } else {
            return 0;
        }
    }

}


