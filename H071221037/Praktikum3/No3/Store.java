import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Product> productList = new ArrayList<>();

    //constructor dengan parameter nama toko
    public Store(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //constructor untuk menambahkan nilai nama produk, harga dan stok kedalam arraylist menggubakan method getter
    public void tambahProduct(Product barang) {
        productList.add(barang);
    }

    //behaviour untuk menampilkan list produk, harga dan stok disertai nomor urut produk dan nama toko
    public void listProduct() {
        System.out.printf("Selamat datang di %s\n", this.getName());
        System.out.println("Daftar Produk : ");
        //perulangan untuk menambahkan produk disertai nomor urut sesuai dengan jumlah produk yang ditambahkan
        for (int i = 0; i < productList.size(); i++) {
            Product item = productList.get(i);
            //print format untuk menampilkan produk beserta harga dan stoknya
            System.out.printf("%d. %s - Rp%d  | Stok %d\n", i + 1, item.getName(), item.getPrice(), item.getStock());
        }
    }
    //behaviour untuk mengkonfirmasi pembelian dari user dengan parameter int n
    public void konfirmasi(int n) {
        Product item = productList.get(n);
        //print format untuk menampilkan nama produk dan harganya
        System.out.printf("Apakah anda yakin ingin membeli %s, dengan harga $%d\n", item.getName(),item.getPrice());
        System.out.println("1.Konfirmasi");
        System.out.println("2.Batal");
    }
    //behaviour untuk memproses transaksi dengan parameter int n dan class user
    public void transaksi(int n, User user) {
        Product barang = productList.get(n);
            //pembelian berhasil (balance user - harga barang) dan stok dikurangi 1
            if (user.getBalance() >= barang.getPrice()) {
                user.setBalance(user.getBalance() - barang.getPrice());
                barang.jualProduk();
                System.out.printf("%s berhasil membeli %s.\n", user.getName(), barang.getName());
                System.out.println("--------------------");
                System.out.println("Lanjutkan Transaksi"); //konfirmasi untuk lanjutkan transaksi
                System.out.println("1.iya");
                System.out.println("2. tidak");
                //kondisi jika stok produk = 0 makan produk, harga, dan stok akan dihapus dari list produk
                if (barang.getStock() <= 0) {
                    productList.remove(barang);
                }
            } else { //kondisi jika balance user < dari harga produk, terkonfirmasi gaga
                System.out.printf("uang tidak cukup, Sisa uang anda : %d%n", user.getBalance()); //("Uang anda tidak mencukupi %nSisa uang : %d", user.getBalance());
                System.out.printf("%s gagal membeli %s.\n", user.getName(), barang.getName());
                System.out.println("--------------------");
                System.out.println("Lanjutkan Transaksi");//konfirmasi untuk lanjutkan transaksi
                System.out.println("1.iya");
                System.out.println("2. tidak");
            }
    }
}
