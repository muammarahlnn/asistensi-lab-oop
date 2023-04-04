import java.util.Scanner;
public class No6 {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner (System.in);
            System.out.print("Input Jari-Jari Lingkaran : ");
            double r,phi,hasil;
            phi = 3.14;
            r = sc.nextFloat();
            sc.close();
            hasil = phi * r * r;
            System.out.printf("%.2f",hasil);
        } catch (Exception e){
            System.out.println("Inputan bukan angka");
        }
    }
}
