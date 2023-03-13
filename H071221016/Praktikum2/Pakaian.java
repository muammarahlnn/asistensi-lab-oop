public class Pakaian{
    // atribut
    String jenis;
    String warna;
    int ukuran;
    public void  jenisPakaian(String jenisPakaian){
        jenis =  jenisPakaian;
    }
    public void warnaPakaian(String warnaPakaian) {
        warna = warnaPakaian;
    }   
    public void ukuranPakaian(int ukuranPakaian) {
        ukuran = ukuranPakaian;
    }
    public void detailPakaian() {
        System.out.println("Jenis Pakaian : " + jenis);
        System.out.println("warna : " + warna);
        System.out.println("Ukuran Pakaian : " + ukuran );
    }
    public static void main(String[] args){
        Pakaian pakaian1 = new Pakaian();
        pakaian1.jenisPakaian("Kaos");
        pakaian1.warnaPakaian("Merah");
        pakaian1.ukuranPakaian(56);
        pakaian1.detailPakaian();
        
    }
}
    
    
    
    