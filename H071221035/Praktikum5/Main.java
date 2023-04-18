public class Main {
    
    public static void main(String[] args) {
        // Objek Komunitas
        KomunitasProgrammerUnhas komunitas = new KomunitasProgrammerUnhas();
        
        // Menambahkan nama pengurus inti beserta jabatannya
        komunitas.tambahPengurusInti("JOKOWI", "Ketua");
        komunitas.tambahPengurusInti("MA'RUF AMIN", "Wakil Ketua");
        komunitas.tambahPengurusInti("MEGAWATI", "Sekretaris");
        komunitas.tambahPengurusInti("SRI MULYANI", "Bendahara");
        
        // Menambahkan nama koordinator beserta jabatannya
        komunitas.tambahKoordinator("LUHUT PANDJAITAN", "Koordinator Bidang 1");
        komunitas.tambahKoordinator("MAHMUD MD", "Koordinator Bidang 2");
        komunitas.tambahKoordinator("MAEMUNAH", "Koordinator Bidang 3");
        // Menampilkan daftar pengurus inti dan koordinator beserta2
        komunitas.tampilkanPengurus();
}
}