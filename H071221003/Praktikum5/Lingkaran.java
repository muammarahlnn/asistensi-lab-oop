public class Lingkaran extends BangunDatar {

    public void hitungLuas() {
        luas = Math.PI * Math.pow(super.getJarijari(), 2);
        System.out.println("3. Lingkaran ");
        System.out.println("luas : " + luas);
    }

    public void hitungKeliling() {
        keliling = 2 * Math.PI * getJarijari();
        System.out.println("keliling : " + keliling + "\n");
    }

}