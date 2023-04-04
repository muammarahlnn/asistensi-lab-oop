import java.util.Scanner; // mengimport untuk menginput 
public class No1 { // membuat class (nama kelas disesuaikan dengan nama file)
    public static void main (String[] args){ 
        Scanner sc = new Scanner (System.in); //scanner = tipe data dari variabel sc, sedangkan new scanner merupakan fungsi untuk menginput 
        int jumlahSoal,hasil; // int = mendeklarasikan bahwa tipe datanya integer
        String nim = sc.next(); //string =  tipe data , nim variabel, sc.next untuk memanggil fungsi  
        sc.close();

        nim = nim.substring(nim.length()-3); //substring = fungsi memotong string , nim length merupakan panjang dari inputan nim
        System.out.println(nim); //fungsi cetak
        int nimInt = Integer.parseInt(nim); //buat variabel baru untuk mengubah tipe data menjadi integer
        jumlahSoal = 7;
        hasil = nimInt % jumlahSoal;
        if (hasil == 0 ){
            System.out.println(jumlahSoal);   
        } else {
            System.out.println(hasil);
        }
    }
    
}