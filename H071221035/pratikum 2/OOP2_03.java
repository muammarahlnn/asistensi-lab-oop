public class OOP2_03 {
    public static void main(String[] args) {
        Produk produk = new Produk();
        produk.id = "01001";
        produk.nama = "GINJAL";
        produk.stok = 55;
        produk.harga = 27000000;
        produk.dataproduk();
        produk.informasi();

        Produk produk2 = new Produk();
        produk2.id = "06001";
        produk2.nama = "JANTUNG";
        produk2.stok = 0;
        produk2.harga = 27000000;
        produk2.dataproduk();
        produk2.informasi();
    }
}

class Produk {
    String id;
    String nama;
    int stok;
    int harga;

    void dataproduk() {
        System.out.println("-----------------------");
        System.out.println("ID PRODUK :" + id);
        System.out.println("NAMA : " + nama);
        System.out.println("STOK : " + stok);
        System.out.println("HARGA : " + harga);
        System.out.println("-----------------------");
    }

    void informasi() {
        if (stok > 0) {
            System.out.printf("STOK %s BAPAK KAU TERSEDIA\n", nama);
            System.out.println("-----------------------");
        } else {
            System.out.printf("STOK %s BAPAK KAU UDAH HABIS\n", nama);
            System.out.println("-----------------------");
        }
    }
}
