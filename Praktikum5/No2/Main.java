public class Main {
    public static void main(String[] args) {
        Pengurus pengurus = new Pengurus("Tono ");
        System.out.println(pengurus.getNama() + "merupakan " + pengurus.getPosisi());

        Koordinator koordinator = new Koordinator("Jamal "," Bidang operasional ");
        System.out.println(koordinator.getNama() + "merupakan " + koordinator.getPosisi() + " di " + koordinator.getBidang());

        Staf staf = new Staf("Nur "," Bidang keuangan ");
        System.out.println(staf.getNama() + "merupakan " + staf.getPosisi() + " di " + staf.getBidang());

    }
    
}
