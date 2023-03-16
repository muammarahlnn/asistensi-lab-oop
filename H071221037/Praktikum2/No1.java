public class No1 {

    // pemanggilan
    public static void main(String[] args) {
        // objek pada class
        Motor data = new Motor();
        data.setNamaMotor("Honda Vario");
        data.setTahunPembelian(2022);
        data.setHarga(26_900_000);
        //output
        System.out.println("Nama Motor : "+ data.getnama());
        System.out.println("Tahun Pembelian: "+ data.gettahun());
        System.out.println("Harga motor : "+ data.getharga());
    }
}
