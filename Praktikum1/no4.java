import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        System.out.print("Masukkan judul film: ");
        String kalimat = inp.nextLine(); //perintah untuk memasukkan nilai string kalimat


        String[] kata = kalimat.toLowerCase().split(" "); //regex untuk mengurutkan char dalam array

        //deklarasi variabel untuk diisi dengan string baru
        String kalimatBaru = "";


        //kondisi untuk mengubah setiap karakter string kata menjadi uppercase mulai dari index 0, 1
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }
        System.out.println("Kalimat setelah diubah: " + kalimatBaru.trim());
        inp.close();
    }
    
}

            