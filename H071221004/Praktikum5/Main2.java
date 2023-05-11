public class Main2 {
    
    public static void main(String[] args) {
        // Objek Komunitas
        SistemInformasi organisasi = new SistemInformasi();
        
        // Menambahkan nama pengurus inti beserta jabatannya
        organisasi.tambahPengurusInti("Rahmatia", "Ketua");
        organisasi.tambahPengurusInti("Rahmat", "Sekretaris");
        organisasi.tambahPengurusInti("Tia", "Bendahara\n");
        
        // Menambahkan nama koordinator beserta jabatannya
        organisasi.tambahKoordinator("Bubu", "Koordinator Bidang Sarana dan \n\t  Prasarana");
        organisasi.tambahKoordinator("Cifuu", "Koordinator Bidang Pertunjukan");
        organisasi.tambahKoordinator("Koyu", "Koordinator Bidang Konsumsi\n");
        // Menampilkan daftar pengurus inti dan koordinator beserta2
        organisasi.tampilkanPengurus();
}
}