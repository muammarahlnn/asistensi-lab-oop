import java.util.Scanner;

public class no1 {
        public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        System.out.print("NIM : ");
        String inputNIM = inp.nextLine(); //perintah untuk memasukkan nilai  string NIM

        //integer.parseint untuk mengkonversi nilai bertipe data string menjadi nilai bertipe data int
        //inputNIM.substring(inputNIM.length() - 3) untuk mengambil 3 karakter dari belakang
        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));

        //untuk menambah nilai pada string soal dari hasil modulo 7
        int number = inputNIMint % 7;
        System.out.println(number == 0 ? "Soal: no 7" : "Soal : no " + number);
        inp.close();
    }
}


