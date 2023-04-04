import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner inputNim = new Scanner(System.in);
        
        System.out.print("NIM: ");
        String fullNim = inputNim.next();
        int nim = Integer.parseInt(fullNim.substring(fullNim.length()-3, fullNim.length()));
        System.out.println(nim);
        inputNim.close();
        if (nim % 7 == 0){
            System.out.println("soal no 7");
        }else{
            System.out.println("Soal no " + nim % 7);
        }
    }
}
