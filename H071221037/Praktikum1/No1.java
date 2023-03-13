import java.util.Scanner;

public class No1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int jumlahSoal,hasil;
        String nim = sc.next(); 
        sc.close();
        nim = nim.substring(nim.length()-3);  // substring itu untuk memotong string agar hanya 3 akhir yang dijadikan output
        System.out.println(nim);
        int nimInt = Integer.parseInt(nim);  // integer.parseint itu untuk mengubah string nim menjadi integer
        jumlahSoal = 7;
        hasil = nimInt % jumlahSoal;
        if (hasil == 0 ){
            System.out.println(jumlahSoal);   
        } else {
            System.out.println(hasil);
        }
    }
    
}