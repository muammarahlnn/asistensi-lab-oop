import java.util.Scanner;
public class No3 {
    public static void main (String[] args){
        try{
        Scanner sc = new Scanner (System.in);
        Scanner scBaru = new Scanner (System.in);
        String name, hobby;
        System.out.print("Nama : ");
        name = sc.nextLine();
        System.out.print("Umur : ");
        int umur = sc.nextInt();    
        sc.close();  // ini untuk menutup inputan nama dan umur 
        System.out.print("Hobby : ");
        hobby = scBaru.nextLine();
        scBaru.close(); // untuk menutup inputan hoby , beda dengan yang diatas karena umur itu integer , jadi harus dipisah 
        System.out.printf("Nama saya %s, %d tahun, hobby %s",name, umur, hobby);
        } catch (Exception e){
            System.out.println("Inputan untuk umur bukan angka");
        }
    }
}
