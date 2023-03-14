import java.util.Scanner;

public class Soal03{
  public static void main(String[]args){
    String nama;
    int umur;
    String hobby;
    
    Scanner scans =new Scanner(System.in);
    Scanner scani =new Scanner(System.in);
   


    try{
      System.out.print("Name : ");
      nama=scans.nextLine();
      System.out.print("Umur : ");
      umur=scani.nextInt();
      System.out.print("Hobby : ");
      hobby=scans.nextLine();

      scans.close();
      scani.close();

      System.out.println("Nama saya "+nama+", " +umur+ " tahun, " + "hobby " + hobby);

    }catch(Exception e){
    System.out.println("Masukkam umur berupa angka");
    }
  }
  }