import java.util.Scanner;
public class Soal5{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String b = input.next();
        String hari = b.substring(0,2);
        // mengambil substring atau potongan dari String b,
        //  dimulai dari karakter ke-0 (karakter pertama) hingga karakter sebelum ke-2 
        System.out.print(Integer.parseInt(hari));
        // mengonversi nilai String hari menjadi tipe data int,
        String bulan = b.substring(3,5);
        int month = Integer .parseInt(bulan);
        if (month == 1){
            System.out.print(" Januari ");
        }
        else if (month == 2){
            System.out.print(" Februari ");
        } 
        else if (month == 3){
            System.out.print(" Maret ");
        }
        else if (month == 4){
            System.out.print(" April ");
        }
        else if (month == 5){
            System.out.print(" Mei ");
        }  
        else if (month == 6){
            System.out.print(" Juni ");
        } 
        else if (month == 7){
            System.out.print(" Juli ");
        }
        else if (month == 8){
            System.out.print(" Agustus ");
        }  
        else if (month == 9){
            System.out.print(" September ");
        }
        else if (month == 10){
            System.out.print(" Oktober ");
        } 
        else if (month == 11){
            System.out.print(" November ");
        }
        else if (month == 12){
            System.out.print(" Desember ");
        }    
        String tahun = b.substring(6,8);
        // mengambil substring atau potongan dari String 
        // b, dimulai dari karakter ke-6 hingga karakter sebelum ke-8
        int  year = Integer.parseInt(tahun);
        if (year <= 23){
            System.out.print("20" + tahun);
        } 
        else {
            System.out.print("19" + tahun);
        }
        input.close();        
    }
}


