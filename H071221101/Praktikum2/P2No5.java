// public class P2No5 {
//     public static void main(String[] args) {
//         Alamat alamat = new Alamat("BTP", "Makassar");
//         Mahasiswa mahasiswa = new Mahasiswa("Khalizatul Jannah", "H071221101", alamat);
        
//         System.out.println("Nama : " + mahasiswa.getNama());
//         System.out.println("Nim : " + mahasiswa.getNim());
//         System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
//     }
// }
class Mahasiswa {
    private String nama;
    private String nim;
    private Alamat alamat;

    public Mahasiswa(String nama, String nim, Alamat alamat) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public static void main(String[] args) {
        Alamat alamat = new Alamat("BTP", "Makassar");
        Mahasiswa mahasiswa = new Mahasiswa("Khalizatul Jannah", "H071221101", alamat);
        
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}

class Alamat {
    private String jalan;
    private String kota;

    public Alamat(String jalan, String kota) {
        this.jalan = jalan;
        this.kota = kota;
    }

    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}
