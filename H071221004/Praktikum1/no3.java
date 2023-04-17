import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        try {
            System.out.print("Name : ");
            String name = inp.nextLine(); //perintah untuk memasukkan nilai  string nama

            //integer.parseint untuk mengkonversi nilai bertipe data string menjadi nilai bertipe data int
            System.out.print("Umur : ");
            int age = inp.nextInt(); //perintah untuk memasukkan nilai integer
            inp.nextLine();
            
            System.out.print("Hobby : ");
            String hobby = inp.nextLine(); //perintah untuk memasukkan nilai string hobby

            System.out.println("Nama saya " + name+ ", " + age + " Tahun" + ", " +"Hobby "+ hobby);
            inp.close();
        } catch (Exception e) { //Untuk menghandle jika terjadi kesalahan
            System.out.println("Umur harus berupa angka");   
        }
    }
}
