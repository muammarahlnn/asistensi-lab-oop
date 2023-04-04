import java.util.Scanner;
public class No2 {
    public static void main(String[] args){
         try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Double[] nums = new Double[n];// membuat array hanya untuk inputan double, n merupakan panjang array
            int panjangBulat,panjangDesimal; //deklarasikan
            panjangBulat = 0; // tempat isi nilainya 
            panjangDesimal = 0;

            for (int i = 0; i<n;i++){ // for i in range 0,5 , i++ = di python i+=1
                nums[i]= sc.nextDouble(); //tempat inputan, 5 kali inputan
                
                if (nums[i] % 1 == 0){ // jika nilai dari inputan modulo 1 = 0  maka hasilnya adla bilangan bulat
                    panjangBulat += 1;// setiap inputan dapat =0 maka akan ditambahkan nilainya ke panjang bulat
                } else {
                    panjangDesimal += 1;//
                }
        
            }
            System.out.printf("%d Bilangan Bulat \n%d Bilangan Desimal",panjangBulat,panjangDesimal); //print format untuk menampilkan hasil
            sc.close();
          }  catch (Exception e) {
             System.out.println("Inputan Bukan angka");
         }
    }
    
}
