
public class OOP2_05{
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Batu Tambung";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "M.Ilham Maulana";
        mahasiswa.nim = "H071221035";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("NIM: "+ mahasiswa.getNim());
        System.out.println("Alamat : "+ mahasiswa.getAlamat().getAlamatLengkap());

    }
}
class Mahasiswa{
    String nama;
    Alamat alamat;
    String nim;

    String getNama(){
        return nama;
    }

    String getNim(){
        return nim;
    }

    Alamat getAlamat(){
        return alamat;
    }
}

class Alamat{
    String jalan;
    String kota;

    String getAlamatLengkap(){
        return jalan + ", " +kota;
    }
}