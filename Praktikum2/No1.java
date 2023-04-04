public class No1 {

    public static void main(String[] args) {
        // proses instansiasi di class Ibukota dalam class no1
        Ibukota ibukota = new Ibukota();

        // tambahkan nilai pada atribut
        ibukota.nama = "Jakarta";
        ibukota.negara = "Indonesia";
        ibukota.kode = "021";
        // panggil salah satu method
        ibukota.deskripsiIbukota();
    }
}