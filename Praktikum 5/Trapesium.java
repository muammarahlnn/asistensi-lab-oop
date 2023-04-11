public class Trapesium extends BangunDatar {
    
    public void hitungLuas(){
        luas = 0.5* (super.getSisi1() + super.getSisi2()) * getTinggi();
        System.out.println("5. Trapesium");
        System.out.println("luas : " + luas);
    }
    public void hitungKeliling(){
        keliling = super.getSisi1() + super.getSisi2() + super.getSisi3() + super.getSisi4();
        System.out.println("keliling : " + keliling + "\n");
    }
    
    
}
