import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Input jari-jari : ");
            double r = input.nextDouble();  
            double pi = Math.PI; 
            double hitungLuas = pi*Math.pow(r, 2);

            System.out.printf("Luas lingkaran : " + "%.2f", hitungLuas);   //dipake kalau mau nyelipin var inputan
            // "%2f" -> 2 angka belakang koma

        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
        input.close();
    }
}
