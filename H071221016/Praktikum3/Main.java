public class Main {
    public static void main(String[] args) {
        Rumah rumah1 = new Rumah(100000000, new LuasRumah(20, 10),"Makassar");
        Rumah rumah2 = new Rumah(200000000, "Makassar");

        rumah1.tampilkanInfoRumah();
        System.out.println("Harga per meter persegi rumah 1: Rp " + rumah1.hitungHargaPerMeter());
        System.out.println("================================================================");
        rumah2.tampilkanInfoRumah();
        System.out.println("Harga per meter persegi rumah 2: Rp " + rumah2.hitungHargaPerMeter());

       
    }
}

