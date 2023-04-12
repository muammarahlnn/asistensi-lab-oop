public class Main {
    
    public static void main(String[] args) {
        // Objek Komunitas
        KomunitasProgrammerUnhas komunitas = new KomunitasProgrammerUnhas();
        
        // Menambahkan nama pengurus inti beserta jabatannya
        komunitas.tambahPengurusInti("Reza", "Ketua");
        komunitas.tambahPengurusInti("Ilham", "Wakil Ketua");
        komunitas.tambahPengurusInti("Khaekal", "Sekretaris");
        komunitas.tambahPengurusInti("Aan", "Bendahara");
        
        // Menambahkan nama koordinator beserta jabatannya
        komunitas.tambahKoordinator("haikal", "Koordinator Bidang 1");
        komunitas.tambahKoordinator("aditya", "Koordinator Bidang 2");
        komunitas.tambahKoordinator("ilhamsh", "Koordinator Bidang 3");
        // Menampilkan daftar pengurus inti dan koordinator beserta2
        komunitas.tampilkanPengurus();
}
}