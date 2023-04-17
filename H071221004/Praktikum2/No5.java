public class No5 {      
     public static void main(String[] args) {
        Alamat alamat = new Alamat();
        //mengisi nilai pada tribut di class Alamat
        alamat.jalan = "Antang";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        // nilai alamat diambil dari nilai alamat di class Alamat
        mahasiswa.alamat = alamat;
        // mengisi nilai pada atribut di class  Mahasiswa
        mahasiswa.nama ="Rahmatia";
        mahasiswa.nim = "H071221004";
        //mengambil nilai dari method yang sudah diset nilai atributnya
        System.out.println("Nama: " + mahasiswa.getName());
        System.out.println("NIM: " + mahasiswa.getNim());
        // menset nilai alamat dan mengambil nilainya
        // kemudian di concat di method getAlamatLengkap lalu mencetak hasilnya
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
    

