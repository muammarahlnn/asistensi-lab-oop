import java.util.Scanner;
public class No4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine().toLowerCase();   // semua inputan yang dimasukkan itu diubah menjadi lower case atau huruf kecil
        sc.close();
        String[] hasil = kalimat.split(" ");
        upper(hasil);   // memanggil method yang ada dibuat untuk mengkapitalkan huruf awal 
            }

    public static void upper(String[]hasil) {   // ini method untuk mengkapitalkan huruf awal 
        for (int i = 0; i < hasil.length;i++){
            String hurufAwal = hasil[i].substring(0, 1);
            hurufAwal = hurufAwal.toUpperCase();
            String sisaKata = hasil[i].substring(1, hasil[i].length()); 
            String fix = hurufAwal + sisaKata; 
            System.out.print(fix+" ");
        
        }
               

           
    }
}
