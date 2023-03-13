import java.util.Scanner;
public class no5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //inisialisasi objek dari class scannaer 
        String tanggal = inp.nextLine(); //perintah untuk memasukkan inputan
        //array untuk menginput tanggal
        String[] arraytanggal = tanggal.split("-");
        
        //array untuk mengganti inputan di index 3
        int[] arraytanggal2 = new int [3];
        //parseint untuk mengkonversi string menjadi integer
        for (int i = 0; i < arraytanggal.length; i++) {
            arraytanggal2[i] =  Integer.parseInt(arraytanggal[i]);
        }
        //untuk menambah value string tahun dengan string
        int tahun = arraytanggal2[2];
        String tahun2 = "";
        //kondisi untuk mengeluarkan output tahun 2000+ jika kondisi terpenuhi
        if (tahun >= 0 && tahun <= 23){
            tahun2 = "20" + tahun;
        } else {
            //mengeluarkan output jika kondisi tidak terpenuhi
            tahun2 = "19" + tahun;
        }
        System.out.println(arraytanggal2[0] + " " + konversiBulan(arraytanggal2[1])+ " " + tahun2);
        inp.close();
    }
    public static String konversiBulan(int angka){
        if (angka == 1) {
            return "Januari";
        } else if (angka == 2) {
            return "Februari";
        } else if (angka == 3) {
            return "Maret";
        } else if (angka == 4) {
            return "April";
        } else if (angka == 5) {
            return "Mei";
        } else if (angka == 6) {
            return "Juni";
        } else if (angka == 7) {
            return "Juli";
        } else if (angka == 8) {
            return "Agustus";
        } else if (angka == 9) {
            return "September";
        } else if (angka == 10) {
            return "Oktober";
        } else if (angka == 11) {
            return "November";
        } else if (angka == 12) {
            return "Desember";
        } else {
            return "";
        }
    }
}

    