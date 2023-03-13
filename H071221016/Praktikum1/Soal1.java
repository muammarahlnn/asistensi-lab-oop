import java.util.Scanner;
public class Soal01{
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);

        String nim=scan.next();
        int dig =Integer.parseInt(nim.substring(7,nim.length()));
        if (dig%7==0){
            dig=7;
        }else {
            dig=dig%7;

        }   
            scan.close();
            System.out.println("no "+dig);

    

        }

    }

