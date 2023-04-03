public class Akreditasi_Kampus{
    
    // Attribut 
    String nama;
    Lokasi lokasi;
    int nilaiAkreditasi;

    // void setNama(String nama){
    //     this.nama = nama;
    // }
    // void setLokasi(String lokasi){
    //     this.lokasi = lokasi;
    // }
    // void setNilai_akreditasi(int nilaiAkreditasi){
    //     this.nilaiAkreditasi = nilaiAkreditasi;
    // }
    // String nama(){
    //     return nama;
    // }
    // String lokasi(){
    //     return lokasi;
    // }
    // int nilaiAkreditasi(){
    //     return nilaiAkreditasi;
    // }

    // constructor
    public Akreditasi_Kampus(){
    }
    
    public Akreditasi_Kampus(String nama, Lokasi lokasi, int nilaiAkreditasi){
        this.nama = nama;
        this.lokasi = lokasi;
        this.nilaiAkreditasi = nilaiAkreditasi;
    }
    // Behavior 1 menampilkan info kampus
    public void TampikanInfoKampus(){
        System.out.println("Nama Kampus : " + nama);
        System.out.println("lokasi Kampus :" + lokasi.getLokasi());
        System.out.println("nilai Akreditasi :" + nilaiAkreditasi);
    }
    
    // Behavior 2 menghitung nilai akreditasi kampus 
    public String HitungNilaiAkreditasi(){
        String Akreditasi = "";
        if(nilaiAkreditasi >= 361){
            Akreditasi = "A";    
        }else if (nilaiAkreditasi >= 301){
            Akreditasi = "B";
        }else if (nilaiAkreditasi >= 200){
            Akreditasi = "C";
        }else {
            Akreditasi = "Tidak Terakreditasi";
        }

        return Akreditasi;
    }
}
class Lokasi {
    
    private String lokasi ;

    public Lokasi(String lokasi){
        this.lokasi = lokasi;
    }
    
    public String getLokasi(){
        return lokasi;
    }
}