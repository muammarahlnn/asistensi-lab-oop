public class Produk {
    private int idProduk;
    private String namaProduk;
    private int stokProduk;
    private double hargaProduk;

    public Produk(int id,String nama,int stok,double harga){
        idProduk = id;
        namaProduk = nama;
        stokProduk = stok;
        hargaProduk = harga;
    }
    public void setIdProduk(int idProduk) {
        this.idProduk = idProduk;
    }
    public int getIdProduk() {
        return idProduk;
    }
    public String getNamaProduk() {
        return namaProduk;
    }
    public int getStokProduk() {
        return stokProduk;
    }
    public double getHargaProduk() {
        return hargaProduk;
    }
    public void cekData() {
        System.out.println("ID produk: " + getIdProduk());
        System.out.println("Nama produk: " + getNamaProduk());
        System.out.println("Stok produk: " + getStokProduk());
        System.out.println("Harga produk: " + getHargaProduk());
        if (stokProduk <= 0) {
            System.out.println("Produk tidak tersedia");   
        } else {
            System.out.println("Produk masih tersedia");
        }
    }
    public static void main(String[] args) {
        Produk produk1 = new Produk(1,"Tas Ransel",50,50000);
        produk1.cekData();
        Produk produk2 = new Produk(2, "Baju", 0, 100000);
        produk2.cekData();
    } 
}

    
   

       