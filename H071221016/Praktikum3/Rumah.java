public class Rumah {
    // Attributes
    private int harga;
    private LuasRumah luasRumah;
    private String alamat;
  

  
    // Constructor 
    public Rumah(int harga, LuasRumah luasRumah,String alamat) {
        this.harga = harga;
        this.luasRumah = luasRumah;
        this.alamat = alamat;
    }
    public Rumah(int harga,String alamat){
        this.harga = harga;
        this.luasRumah = new LuasRumah(10, 20);
        this.alamat = alamat;

    }
    // Behaviors
    public void tampilkanInfoRumah() {
        System.out.println("Harga rumah: Rp " + harga);
        System.out.println("Luas tanah: " + luasRumah.getLuasTanah() + " m2");
        System.out.println("Luas bangunan: " + luasRumah.getLuasBangunan() + " m2");
        System.out.println("Alamat rumah: " + alamat);
    }
  
    public double hitungHargaPerMeter() {
        return harga / (luasRumah.getLuasTanah() + luasRumah.getLuasBangunan());
    }
}
