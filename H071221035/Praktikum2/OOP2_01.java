class Partai { //deklarasikan
   String warna;
   int anggota;
   String namaPartai; 

    void identitas(){ //method //VOID TIDAK MENGEMBBALIKAN RETURN
    System.out.println("Nama Partai = "+ namaPartai);
    System.out.println("warna = "+ warna);
    System.out.println("jumlah anggota = "+anggota);
    }
} //psvm =
 public class OOP2_01{ //public class 
    public static void main(String[] args) {
        Partai partai = new Partai();
        partai.namaPartai = "PDIP";
        partai.anggota = 500;
        partai.warna = "MERAH";
        partai.identitas();
    }
 }
