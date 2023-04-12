public class Segitiga extends BangunDatar {
   
    public void hitungLuas(){
        luas = getAlas()*getTinggi();
        System.out.println("4. Segitiga");
        System.out.println("luas : " + luas);
    }
    public void hitungKeliling(){
        keliling = getSisiA()*getSisiB()*getSisiC();
        System.out.println("keliling : " + keliling + "\n");
    }


}
