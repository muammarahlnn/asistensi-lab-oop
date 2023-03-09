public class no7 {
     // Inisialisasi array dengan data hewan
     // membuat member hanya bisa diakses oleh dari dalam class itu sendiri
     private static String[] data = {"beruang", "panda", "ikan", "ayam", "sapi", "pinguin", "bebek"};
    
     public static int findIndex(String text) {
         // Konversi teks ke huruf kecil agar case-insensitive
         text = text.toLowerCase();
     
        // Cari indeks teks dalam array
        for (int i = 0; i < data.length; i++) {
        // equals membandingkan dua String berdasarkan kontennya.
            if (data[i].toLowerCase().equals(text)) {
                return i;
            }
        }

        // Jika teks tidak ditemukan, kembalikan -1
        return -1;
    }
     
    public static void main(String[] args) {
        //digunakan untuk mencari posisi (index) pertama suatu string dalam string yang lain
        // Cari indeks teks dalam array
        System.out.println("Indeks dari 'pinguin': " + findIndex("pingUin"));
        System.out.println("Indeks dari 'sapi': " + findIndex("sapi"));

        // Cari indeks teks yang tidak ada dalam array
        System.out.println("Indeks dari 'singa': " + findIndex("singa"));
    }
}
