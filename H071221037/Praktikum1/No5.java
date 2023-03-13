import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class No5 {
    
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String inputan ;
        System.out.println();
        inputan = sc.nextLine();
        sc.close();
        try{
        Date tanggal = new Date();
        SimpleDateFormat inputan = new SimpleDateFormat("DD-MM-yyyy");
        String hasil = input.format(tanggal);
        System.out.println(hasil);
        } catch (Exception e) {

        }





    }
}
