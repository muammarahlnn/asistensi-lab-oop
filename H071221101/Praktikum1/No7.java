import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zoo = sc.nextLine();
        int kebun = findIndex(zoo);
        System.out.println(kebun);

        sc.close();
    }
    public static int findIndex(String teks) {
        String binatang[] = {"Singa", "gajah", "ayam", "bebek", "anjing"};
        for (int i = 0; i < binatang.length; i++) {
            if (binatang[i].equalsIgnoreCase(teks)) {
                return i;
                
            }
        }
        return -1;
    } 
    
}