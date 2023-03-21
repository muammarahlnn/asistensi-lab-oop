public class Alamat{
    
    String jalan, kota;

    void setAlamat(String jalan){
        this.jalan = jalan;    
    }
    void setAlamatLengkap(String kota){
        this.kota = kota;
    }
    String getAlamat(){
        return jalan;
    }
    String getAlamatLengkap(){
        return jalan + ", " +kota;
    }
}
