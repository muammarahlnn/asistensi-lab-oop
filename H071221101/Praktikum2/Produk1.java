public class Produk1 {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    public Produk1(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isTersedia() {
        return stok > 0;
    }
    
    //class main
    public static void main(String[] args) {
        Produk1 produk1 = new Produk1(111, "Bantal", 60, 34000);
        Produk1 produk2 = new Produk1(222, "Guling", 0, 50000);
    
        System.out.println("ID produk 1: " + produk1.getId());
        System.out.println("Nama produk 1: " + produk1.getNama());
        System.out.println("Stok produk 1: " + produk1.getStok());
        System.out.println("Harga produk 1: " + produk1.getHarga());
        System.out.println("Apakah produk 1 tersedia di stok? " + produk1.isTersedia());

        System.out.println("=============================================");

        System.out.println("ID produk 2: " + produk2.getId());
        System.out.println("Nama produk 2: " + produk2.getNama());
        System.out.println("Stok produk 2: " + produk2.getStok());
        System.out.println("Harga produk 2: " + produk2.getHarga());
        System.out.println("Apakah produk 2 tersedia di stok? " + produk2.isTersedia());
    }
}
