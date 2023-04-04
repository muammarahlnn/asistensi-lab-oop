import java.util.Scanner;
public class No4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine().toLowerCase();// mengubah semua kata menjadi lowercase
        sc.close();
        String[] hasil = kalimat.split(" "); //menghilangkan spasi lalu menyimpan dalam array
        upper(hasil);
            }

    
  
    public static void upper(String[]hasil) { // metode untuk mengubah huruf awal kata menjadi kapita
        for (int i = 0; i < hasil.length;i++){
            String hurufAwal = hasil[i].substring(0, 1);// untuk mengambil huruf awal kata
            hurufAwal = hurufAwal.toUpperCase(); // mengubah huruf awal tdi yang dipisahkan menjadi kapitalis
            String sisaKata = hasil[i].substring(1, hasil[i].length()); //sama tapi sisa huruf/kata na pisahkan
            String fix = hurufAwal + sisaKata; //menggabuhgkan kembali kata
            System.out.print(fix);
            if (i< hasil.length - 1) {
                System.out.print(" ");
            }
        
        }
               

           
    }
}
