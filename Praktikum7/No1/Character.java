abstract class Character {
    String name;

    public Character(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract int attack();
    abstract int attack(String attackType);
}
