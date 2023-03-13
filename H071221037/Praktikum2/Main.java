public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan ="Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.Nama = "Ikhsan";
        mahasiswa.Nim = "H071191049";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat().getAlamatLengkap());

    }
}