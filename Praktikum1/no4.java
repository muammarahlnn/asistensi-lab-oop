import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        System.out.print("Masukkan judul film: ");
        String kalimat = inp.nextLine(); //perintah untuk memasukkan nilai string kalimat

        //array untuk menginput nilai dari string kalimat ke dalam kata dan kemudian dikonversi menjadi lowercase
        //fungsi split berguna mengambil nilai dalam variabel string dan mengembalikannya menjadi char array
        String[] kata = kalimat.toLowerCase().split(" "); 

        //deklarasi variabel untuk diisi dengan string baru
        String kalimatBaru = "";


        //kondisi untuk mengubah setiap karakter string kata menjadi uppercase mulai dari index 0, 1
        for (int i = 0; i < kata.length; i++) {
            // untuk mengkombinasikan nilai string kalimat baru dengan nilai string kata yang sudah dikonversi menjadi capitalize each word 
            // dan mengambil character kedua sampai terakhir pada string kata 
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }
        System.out.println("Kalimat setelah diubah: " + kalimatBaru.trim()); //trim untuk memotong karakter-karakter spasi pada bagian awal dan akhir
        inp.close();
    }
    
}

            