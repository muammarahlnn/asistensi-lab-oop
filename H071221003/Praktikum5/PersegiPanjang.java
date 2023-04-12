public class PersegiPanjang extends BangunDatar {

    public void hitungLuas(){
        luas = getPanjang()*getLebar();
        System.out.println("2. Persegi Panjang");
        System.out.println("luas  : " + luas);
    }
    public void hitungKeliling(){
        keliling = 2* (getPanjang()+getLebar());
        System.out.println("keliling  : " + keliling + "\n");
    }

}
