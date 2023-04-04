import java.util.Scanner;

   
class LuasLingkaran {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Menghitung Luas Lingkaran  ##");

    
    try{
      double r, luas;
  
      System.out.print("Input jari-jari lingkaran: ");
      r = input.nextDouble();
    
      luas = Math.PI * Math.pow(r, 2);
      input.close();
       
      System.out.println("Luas lingkaran: "+String.format("%.2f",luas) );
    } catch(Exception e){
      System.out.println("Masukkan jari-jari berupa angka");   
    }
  }
}
    

