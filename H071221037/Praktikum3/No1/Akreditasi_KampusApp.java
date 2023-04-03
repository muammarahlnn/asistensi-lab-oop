public class Akreditasi_KampusApp {
    
    public static void main(String[] args) {
        Akreditasi_Kampus kampus =  new Akreditasi_Kampus();
        kampus.nama = "universitas Sidrap";
        kampus.lokasi = new Lokasi("Sidrap");
        kampus.nilaiAkreditasi = 350;

        kampus.TampikanInfoKampus();
        kampus.HitungNilaiAkreditasi();
        
        Akreditasi_Kampus kampus2 = new Akreditasi_Kampus("Universitas Pangkajene",new Lokasi("Pangkajene"),370);
        kampus2.TampikanInfoKampus();
        kampus2.HitungNilaiAkreditasi();
    }
}
