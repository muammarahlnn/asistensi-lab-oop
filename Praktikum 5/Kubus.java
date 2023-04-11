public class Kubus extends BangunRuang {

    public void hitungLuasPermukaan(){
        luasPermukaan = 6 * (Math.pow(super.getSisi(), 2));
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(14) + "Bangun Ruang" + " ".repeat(14));
        System.out.println("=".repeat(40)); 
        System.out.println("1. Kubus"); 
        System.out.println("luas permukaan : " + luasPermukaan);
    }

    public void hitungVolume(){
        volume = Math.pow(super.getSisi(), 3);
        System.out.println("volume : " + volume + "\n");
    }
    
}
