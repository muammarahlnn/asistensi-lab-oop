import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String buah = sc.next();
        sc.close();
        System.out.println(findIndex(buah));

    }
    public static int findIndex(String buah){
        String [] arrBuah = {"Coconut", "Apple","Banana", "Strawberry"};
        int index = -1;
        for (int i = 0;i < arrBuah.length; i++){
            if (buah.equalsIgnoreCase(arrBuah[i])){     
                index = i;
                return index;   
            } 
        } 
        return index;
    }
}
// memakai equalsignorecase apabila inputan tidak persis sama dengan string di array seperti input coconut , masih memiliki output yaitu Coconut walaupun ada perbedaan kapital 
