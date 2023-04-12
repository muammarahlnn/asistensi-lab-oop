public class MataUangNegara {
    String mataUang;
    String negara;
    String kode;

    //method 1 untuk mencetak nama mata uang
    // \t untuk memposisikan kursor ke tab berikutnya agar penempatan outpunya rapi dan sama rata
    // \n untuk membuat baris baru
    public void deskripsiMataUang() {
        System.out.println("Nama mata uang \t\t: " + mataUang);
        System.out.println("Digunakan dinegara  \t: " + negara);
        System.out.println("Kode mata uang \t\t: " + kode.toUpperCase());
    }
}