import java.util.Scanner;
public class No3 {
    public static void main (String[] args){
        try{
        Scanner sc = new Scanner (System.in);
        String name, hobby;
        System.out.print("Nama : ");
        name = sc.nextLine(); // untuk inputan tipe data string denga garis baru
        System.out.print("Umur : ");
        int umur = sc.nextInt();    // untuk inputan tipe data integer denga garis baru
        System.out.print("Hobby : ");
        sc.nextLine(); //memisahkan
        hobby = sc.nextLine();
        System.out.printf("Nama saya %s, %d tahun, hobby %s",name, umur, hobby);
        sc.close();
        } catch (Exception e){
            System.out.println("Inputan untuk umur bukan angka");
        }
    }
}
