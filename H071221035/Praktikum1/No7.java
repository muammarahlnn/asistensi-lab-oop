import java.util.Scanner;
public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String buah = sc.next();
        sc.close();
        System.out.println(findIndex(buah));//memanggil fungsi

    }
    public static int findIndex(String buah){
        String [] arrBuah = {"Coconut", "Apple","Banana", "Strawberry"};
        for (int i = 0;i < arrBuah.length; i++){ //i tambah 1
            if (buah.equalsIgnoreCase(arrBuah[i])){
                return i;   
            } 
        } 
        return -1;
    }
}

