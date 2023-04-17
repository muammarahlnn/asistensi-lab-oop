package OOP3;

class Senapan {
    private String merk;
    private int kapasitasMagazine;
    private Peluru jenisPeluru;

    public Senapan(String merk, int kapasitasMagazine, Peluru jenisPeluru) {            //konstruktor 1
        this.merk = merk;
        this.kapasitasMagazine = kapasitasMagazine;
        this.jenisPeluru = jenisPeluru;
    }

    public Senapan(String merk, int kapasitasMagazine) {            //konstruktor 2
        this.merk = merk;
        this.kapasitasMagazine = kapasitasMagazine;
        this.jenisPeluru = new Peluru("5.56mm");
    }

    public void isiMagazine() {     //Behaviour 1
        System.out.println("Magazine senapan " + merk + " terisi penuh dengan " +
                jenisPeluru.getJenis() + " sebanyak " + kapasitasMagazine + " butir.");
    }
    public void tembak() {          //Behaviour 2
        if(getKapasitasMagazine()<= 0 ){
            System.out.println("Sisa peluru tidak cukup");
        }else{
        System.out.println("Senapan " + merk + " menembakkan " + jenisPeluru.getJenis() + " sebanyak 1 butir.");
        kapasitasMagazine--;
    }
    }

    public String getMerk() {           //setteer adn geter
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKapasitasMagazine() {
        return kapasitasMagazine;
    }

    public void setKapasitasMagazine(int kapasitasMagazine) {
        this.kapasitasMagazine = kapasitasMagazine;
    }

    public Peluru getJenisPeluru() {
        return jenisPeluru;
    }

    public void setJenisPeluru(Peluru jenisPeluru) {
        this.jenisPeluru = jenisPeluru;
    }
}
//class peluru untuk atribut pelurunya (ternyta kau yg lupa dibuat)
class Peluru {
    private String jenis;

    public Peluru(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

public class OOP3_01 {
    public static void main(String[] args) {

        Peluru peluru1 = new Peluru("7.62mm"); // buat objek senapan1 pake konstruktor pertamanya
        Senapan senapan1 = new Senapan("AK-47", 30, peluru1);
        System.out.println("==================================================");
        
        senapan1.isiMagazine();// Memanggil behaviourNYA isiMagazine pada senapan1
        System.out.println("--------------------------------------------------");
        
        senapan1.tembak();// Memanggil behaviourNYA tembak pada senapan1
        System.out.println("Kapasitas magazine saat ini: " + senapan1.getKapasitasMagazine());
        
        senapan1.setKapasitasMagazine(29);// Mengubah nilai atributnya pake setter
        senapan1.setJenisPeluru(new Peluru("5.56mm"));
        System.out.println("==================================================");
        
        // Membuat objek senapan2 pake constructor kedua
        Senapan senapan2 = new Senapan("M4A1", 20);

        senapan2.isiMagazine();// Memanggil behaviour isiMagazine pada senapan2
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < 25; i++) {// Memanggil behaviour tembak pada senapan2 sebanyak 5 kali(jadi dibuat perulangan)
            senapan2.tembak();
        }
        // System.out.println("DUAR!!! MEGAWATI IS DEAD");
        System.out.println("--------------------------------------------------");
        System.out.println("Kapasitas magazine saat ini: " + senapan2.getKapasitasMagazine());
        System.out.println("==================================================");
    }
}
