public class Produk {
    int ID;
    String nama ;
    int stok;
    double harga; 
   
    void setID(int ID){
        this.ID = ID ;
    }
    void setNama(String nama){
        this.nama = nama ;
    }
    void setStok(int stok){
        this.stok = stok ;
    }
    void setHarga(double harga){
        this.harga = harga ;
    }
    int getID(){
        return ID;
    }
    String getNama(){
        return nama;
    }
    int getStok(){
        return stok;
    }
    double getHarga(){
        return harga;
    }

    String ketersediaanProduk(){
        if (stok > 0){
            return "Tersedia";
        }else {
            return "Tidak Tersedia";
        }
    }

    void deskripsiProduk(){
        System.out.println("Id : "+getID());
        System.out.println("Nama barang : "+getNama());
        System.out.println("Stok barang : "+ ketersediaanProduk());
        System.out.println("Harga barang : "+getHarga());  
    }
}
