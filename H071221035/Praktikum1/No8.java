import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);// inputan
            int[][] num = {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 }
            };
            boolean found = false; //dibuat untuk menghentikan perulangan setelah mendapat nilai inputan
            int n = sc.nextInt();// input 
            sc.close();
            for (int i = 0; i < num.length; i++) { //untuk mengecek perulangan index pertama terhadapat index kedua 
                for (int j = 0; j < num[i].length; j++) {// for j in range 0,i(3) jika lebih kecil dari num i maka panjangnya ditambah 1 
                    if (num[i][j] == n) { //jika telah mendapat angka yang dicari
                        System.out.printf("Found %d at [%d][%d]\n", n, i, j);

                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
            if (!found) {
                System.out.printf("%d tidak ditemukan.\n", n);
            } 


        } catch (Exception e) {
            System.out.println("Inputan Bukan Angka");
        }
    }

}
