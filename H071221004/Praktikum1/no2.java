import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); //Inisialisasi objek input dari class scanner

        int bilBulat = 0; // nilai awal bilangan bulat
        int bilDecimal = 0; //nilai awal bilangan decimal

        //try catch untuk mengatasi exception
       try {
        System.out.print("Masukkan jumlah bilangan inputan n : "); // print mencetak tanpa adanya enter
        int n = inp.nextInt(); //perintah untuk memasukkan nilai integer
        System.out.println("Silahkan masukkan " + n + " bilangan");

            for (int i = 0; i < n; i++){ 
                double num = inp.nextDouble(); //perintah untuk memasukkan nilai double
                if (num % 1 == 0){ 
                    bilBulat++; //kondisi untuk menambah jumlah bilangan pada bilbulat jika kondisi terpenuhi
                
                } else {
                    bilDecimal++; //kondisi untuk menambah jumlah bilangan pada bildecimal jika kondisi if tdk terpenuhi
            
            }
        }// println mencetak dgn adanya enter atau penambahn garis baru
        System.out.println(bilBulat + " bilangan bulat" ); //mencetak jumlah bilangan bulat
        System.out.println(bilDecimal + " bilangan decimal"); // mencetak jumlah bilangan decimal
        
       }catch (Exception e) {
        System.out.println("inputan bukan angka") ;
        inp.close();
     
       }
        }    
    }
