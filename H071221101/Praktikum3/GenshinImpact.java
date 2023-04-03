public class GenshinImpact {
    public String nama;
    public int level;
    public int adventureRank;
    public boolean isAlive; // tambahan variabel boolean

    public GenshinImpact(){
    }
    
    public GenshinImpact(String nama, int level, int adventureRank) {
        this.nama = nama;
        this.level = level;
        this.adventureRank = adventureRank;
        this.isAlive = true; // set awal nilai isAlive menjadi true
    }

    public void tampilkanSpek() {
        System.out.println("Nama: " + nama);
        System.out.println("Level: " + level);
        System.out.println("Adventure Rank: " + adventureRank);
        System.out.println("Status: " + (isAlive ? "hidup" : "mati")); // menampilkan status karakter
        System.out.println();
    }

    public void naikLevel() {
        level++;
        System.out.println("Level " + nama + " naik menjadi " + level);
    }

    public void battle(int damage) {
        System.out.println(nama + " menerima " + damage + " damage");
        if (damage >= 100) {
            isAlive = false; // set nilai isAlive menjadi false jika damage >= 100
            System.out.println(nama + " mati dalam pertarungan");
        } else {
            System.out.println(nama + " masih hidup");
        }
    }

    public static void main(String[] args) {
        GenshinImpact karakter1 = new GenshinImpact("Aether", 20, 30);
        GenshinImpact karakter2 = new GenshinImpact("Lumine", 20, 30);
        //GenshinImpact karakter3 = new GenshinImpact();

        karakter1.tampilkanSpek();
        karakter2.tampilkanSpek();

        karakter1.naikLevel();
        karakter2.battle(20);
        karakter2.battle(80);
        karakter2.battle(120);

        karakter1.tampilkanSpek();
        karakter2.tampilkanSpek();
    }
}
