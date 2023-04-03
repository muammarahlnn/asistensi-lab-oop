package buku;

public class Main {
    public static void main(String[] args) {
        Utils.selfDisplay();
        Buku buku = new Buku("laut", "armin", 45);
        buku.showDetailBuku();
    }

}
