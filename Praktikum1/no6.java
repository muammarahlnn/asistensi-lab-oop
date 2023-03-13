import java.util.Scanner;

public class no6 {

    public static void main(String[] args){
         //Inisialisasi objek input dari class scanner
       Scanner inp =new Scanner(System.in);
        try {
            //Input nilai jari-jari
            System.out.print("Masukan Jari-jari : ");
            double r = inp.nextDouble();
            
            //Menghitung luas lingkaran
            double luasLingkaran = Math.PI * Math.pow(r, 2);
            
            String hasil = String.format("%.2f",luasLingkaran) ;
            
            System.out.println("luas lingkaran adalah : " + hasil);
            inp.close();
        
        } catch (Exception e) {
            System.out.println("inputan bukan angka");
            
        }
        
    }
    
}
