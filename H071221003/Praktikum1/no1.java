import java.util.Scanner;

public class no1 {
        public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        System.out.print("NIM : ");
        String inputNIM = inp.nextLine(); 

        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));
        //parseint untuk menkonversi tipe data integer ke string

        int number = inputNIMint % 7;// sisa dibagi 7
        System.out.printf(number == 0 ? "Soal: no 7" : "Soal : no " + number);
        inp.close();
    }
}