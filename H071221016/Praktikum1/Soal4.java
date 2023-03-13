import java.util.Scanner;

public class Soal04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = inp.nextLine();
        String[] kata = kalimat.toLowerCase().split(" ");
        // String[] kata adalah sebuah variabel array yang akan menampung kata-kata yang sudah dipecah dari kalimat.
        // kalimat adalah sebuah variabel yang berisi sebuah string (teks).
        // Method toLowerCase() digunakan untuk mengubah semua karakter dalam kalimat menjadi huruf kecil (lowercase).
        // Method split(" ") digunakan untuk memecah kalimat menjadi array kata-kata, dengan separator (pemisah) yang digunakan adalah spasi (" ")
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            // menggunakan perulangan untuk mengakses setiap kata dalam array kata.
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
            // kalimatBaru += adalah operator untuk menggabungkan setiap kata yang telah diubah menjadi huruf kapital pada awal kata dengan kata-kata setelah huruf pertama.
            // kata[i] mengakses kata ke-i dalam array kata.
            // substring(0, 1) digunakan untuk memotong string pada posisi awal (0) dan akhir (1), yaitu karakter pertama dalam setiap kata.
            // toUpperCase() digunakan untuk mengubah karakter pertama dari setiap kata menjadi huruf kapital.
            // substring(1) digunakan untuk memotong string mulai dari karakter kedua dalam setiap kata.

// + " " digunakan untuk menambahkan spasi setelah setiap kata yang telah diubah.
        }   
        System.out.println("Kalimat setelah diubah: " + kalimatBaru.trim());
        inp.close();
    }
}