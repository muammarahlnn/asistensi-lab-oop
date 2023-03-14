public class Soal7 {
    private String[] data = { "indonesia", "jerman", "china", "jepang", "brasil", "meksiko", "perancis"};
    public int findIndex(String text) {
        // deklarasi suatu metode yang bertipe data int dengan nama findIndex
        text = text.toLowerCase();
        // mengubah sebuah string yang disimpan dalam variabel text
        // menjadi huruf kecil dan menyimpannya kembali ke dalam variabel text
            for (int i = 0; i < data.length; i++) {
                // perulangan yang digunakan untuk mengiterasi setiap elemen dalam array data
                if (data[i].toLowerCase().equals(text)) {
                // mengubah setiap elemen data menjadi huruf kecil dan membandingkan dengan string text
                    return i;
                }
            }
            // Jika teks tidak ditemukan, kembalikan -1
            return -1;
        }
    
        public static void main(String[] args) {
            Soal7 example = new Soal7();
            // membuat sebuah objek dari kelas Soal7.
            System.out.println("Indeks dari 'Jepang': " + example.findIndex("JePang"));
            // digunakan untuk mencetak output hasil pencarian indeks dari string "Jepang" 
            System.out.println("Indeks dari 'China': " + example.findIndex("China"));
            // digunakan untuk mencetak output hasil pencarian indeks dari string "China" 
            System.out.println("Indeks dari 'Laos': " + example.findIndex("Laos"));
             // Mencetak indeks teks yang tidak ada dalam array
        }
}    

