//NO 1
public class No1{

    public static void main(String[] args) {
        //instansiasi dalam class medsoskreditur
        MedsosKreditur medsosKreditur = new MedsosKreditur("rahmatiaa737@gmail.com", "rahmatia20april");

        //instansiasi dalam class kreditur
        Kreditur kreditur = new Kreditur("Rahmatia", "Sengkang", medsosKreditur, 900_000_000_000L);
        // Kreditur kreditur2 = new Kreditur();

        //panggil method untuk menampilkan output
        kreditur.ProfilKreditur();
        kreditur.peminjaman(700_000_000_000L);
        kreditur.pembayaran(300_000_000_000L);
        kreditur.cekNominalUang();
        
        //panggil behaviour cek kekayaan dari class kurensi
        Kurensi kurensi = new Kurensi(100_000_000);
        kurensi.CekKekayaan();

    }
}