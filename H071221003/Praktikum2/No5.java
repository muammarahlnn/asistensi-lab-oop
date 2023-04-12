public class No5 {      
     public static void main(String[] args) {
        Alamat alamat = new Alamat();
        //mengisi nilai pada tribut di class Alamat
        alamat.jalan = "Jln. Politeknik";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        // nilai alamat diambil dari nilai alamat di class Alamat
        mahasiswa.alamat = alamat;
        // mengisi nilai pada atribut di class  Mahasiswa
        mahasiswa.nama ="Rabiatul Awalyah";
        mahasiswa.nim = "H071221003";
        //mengambil nilai dari method yang sudah diset nilai atributnya
        System.out.println("Nama \t: " + mahasiswa.getName());
        System.out.println("NIM \t: " + mahasiswa.getNim());
        // menset nilai alamat dan mengambil nilainya
        // kemudian di concat di method getAlamatLengkap lalu mencetak hasilnya
        System.out.println("Alamat \t: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}