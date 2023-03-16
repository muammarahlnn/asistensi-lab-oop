public class Motor {
    String namaMotor ;
    int tahunPembelian;
    int harga;

    // method set
    void setNamaMotor(String namaMotor){
        this.namaMotor = namaMotor;
    }
    void setTahunPembelian(int tahunPembelian){
        this.tahunPembelian = tahunPembelian;
    }
    void setHarga(int harga){
        this.harga = harga;
    }
    // method get 
    String getnama(){
        return namaMotor;
    }
    int gettahun(){
        return tahunPembelian;
    }
    int getharga(){
        return harga;
    }
}
