import java.util.Scanner;
public class No2 {
    public static void main(String[] args){
         try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();   // next int untuk menginput integer
            Double[] nums = new Double[n];  // double karena angka dalam array itu ada yang desimal 
            int panjangBulat,panjangDesimal;
            panjangBulat = 0;
            panjangDesimal = 0;

            for (int i = 0; i<n;i++){
                nums[i]= sc.nextDouble();
                
                if (nums[i] % 1 != 0){
                    panjangDesimal += 1;
                } else {
                    panjangBulat += 1;
                }
        
            }
            System.out.printf("%d Bilangan Bulat \n%d Bilangan Desimal",panjangDesimal,panjangBulat);
            sc.close();
          }catch (Exception e) {
             System.out.println("Inputan Bukan angka");
          }
    }
    
}
