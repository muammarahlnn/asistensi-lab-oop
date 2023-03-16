public class No1 {

    public static void main(String[] args) {
        //proses instansiasi di class mataUangNegara dalam class no1
        MataUangNegara mataUangNegara = new MataUangNegara();
        
        //tambahkan nilai pada atribut
        mataUangNegara.mataUang = "Nuevo Sol Peru";
        mataUangNegara.negara = "Peru";
        mataUangNegara.kode = "pen";
        //panggil salah satu method 
        mataUangNegara.deskripsiMataUang();   
    }
}
