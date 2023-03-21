import java.util.Scanner;
public class No8 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int[][] num = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        boolean isFound = false;
        int n = sc.nextInt();
        sc.close();
        for (int i = 0; i < num.length; i++ ){
            for (int j = 0 ; j < num[i].length; j++){
                if (num[i][j]==n){
                    System.out.printf("Found %d at [%d][%d]\n",n,i,j);
                     isFound = true;
                     break;
                } 
                System.out.printf("Current index [%d][%d]\n",i,j);
                
            } 
             if(isFound){
               break;
             }  
        }
        
        } catch(Exception e){
            System.out.println("Inputan Bukan Angka");
        }
    }  
    
}
