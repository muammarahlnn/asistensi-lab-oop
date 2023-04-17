import java.util.ArrayList;

public class Anggota {
    // ArrayList untuk menyimpan nama-nama pengurus dan jabatannya
    ArrayList<String> pengurus = new ArrayList<String>();


    // Method untuk menambahkan nama pengurus dan jabatannya
    public void tambahPengurus(String nama, String jabatan) {
        String pengurusBaru = nama + " \t: " + jabatan;
        pengurus.add(pengurusBaru);
    }
}