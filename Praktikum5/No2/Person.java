public class Person {
    private String nama;
    private String posisi;

    public Person(String nama,String posisi) {
        this.nama = nama;
        this.posisi = posisi;
    }
     public String getNama() {
        return nama;
    }
    public String getPosisi() {
        return posisi;
    }

}

class Pengurus extends Person {
    public Pengurus (String nama) {
        super(nama,"Pengurus");
    }
}

class Koordinator extends Person {
    private String bidang;
    public Koordinator (String nama,String bidang) {
        super(nama,"koordinator");
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }
}

class Staf extends Person {
    private String bidang;

    public Staf(String nama,String bidang) {
        super(nama,"staf");
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }

}