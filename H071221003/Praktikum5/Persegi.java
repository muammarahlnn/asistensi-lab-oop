public class Persegi extends BangunDatar {
   
    public void hitungLuas(){
        luas = Math.pow(super.getSisi(), 2);
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(14) + "Bangun Datar" + " ".repeat(14));
        System.out.println("=".repeat(40));
        System.out.println("1. Persegi");
        System.out.println("luas : " + luas);
    }
    public void hitungKeliling(){
        keliling = Math.pow(super.getSisi(), 4);
        System.out.println("keliling  : " + keliling + "\n");
    }
    
}
