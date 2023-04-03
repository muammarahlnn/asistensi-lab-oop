// package Prak3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        // Inisialisasi data user
        User user = new User("L", 50000);
        // Inisialisasi data store
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Nasi Campur Ayam", "15k", 3));
        products.add(new Product("Salad Buah", "12k", 2));
        products.add(new Product("Es Teh", 5000, 5));

        Store toko = new Store("Kudapan", products);

        // Objek Scanner untuk input dari user
        Scanner input = new Scanner(System.in);

        // Looping untuk melakukan transaksi pembelian produk
        while (true) {
            user.userCard();
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();
            
            // Kode untuk membeli produk
            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    // Konfirmasi pembelian
                    System.out.println("Apakah anda yakin ingin membeli?");
                    System.out.println("1. Konfirmasi");
                    System.out.println("2. Batal");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1 ){
                        toko.buyProduct(user, pilihan-1);
                        break;
                    } else {
                        break;
                    }
                }
            } else {break;}
        }
        input.close();
    }
}    