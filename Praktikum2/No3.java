public class No3 {

    public static void main(String[] args) {
        // proses instansiasi di class Produk dalam class no3
        Produk produk = new Produk();
        //pengisian pertama pada atribut dengan nilai
        produk.idProduk = "ABCD";
        produk.namaProduk = "ABCD Kecap manis";
        produk.stok = 6; 
        produk.harga = 12000;

        Produk produk2 = new Produk("ABC", "ABC Saus Sambal", 0, 13000);

        //memanggil method untuk menampilkan data baru
        produk.tampilkanInfo();
        produk2.tampilkanInfo();
    } 
}
