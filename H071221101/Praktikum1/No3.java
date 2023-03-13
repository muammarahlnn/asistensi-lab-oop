import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
            try {
                System.out.print("Name : ");
                String nama = inp.nextLine();       
                System.out.print("Umur : ");
                int umur = inp.nextInt();
                inp.nextLine();
                System.out.print("Hobby : ");
                String hobby = inp.nextLine();
                System.out.println("Nama Saya " + nama + ", " + umur + " Tahun, " + "Hobby " + hobby );
            } catch (Exception e) {
                System.out.println("inputan umur harus berupa angka");
            }
        inp.close();
    }
    
}
