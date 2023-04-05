// simple Store App
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //instansiasi class user
        User Rahmatia = new User("Rahmatia", 100_000);
        //instansiasi class product
        Product cruiseShip = new Product("History Supreme Yacht", "70k", 1);
        Product house = new Product("Antilia", "31k", 2);
        Product watch = new Product("The Graff Hallucination Watch", "9k", 3);
        Product picture = new Product("'Garçon à la Pipe'", 2000, 3);
        //instasiasi class store
        Store garestia = new Store("Garestia");
        //panggil behaviour tambah produk untuk menambah produk dalam array list
        garestia.tambahProduct(cruiseShip);
        garestia.tambahProduct(house);
        garestia.tambahProduct(watch);
        garestia.tambahProduct(picture);
        //membuat perulangan untuk proses transaksi
        while (true) {
            Rahmatia.card(); //menampilkan info user
            garestia.listProduct(); // menampilkan list produk
            System.out.println("O. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();//masukkan inputan
            if (pilihan <= 0) {
                break;
            }else if(pilihan > garestia.productList.size()){
                System.out.println("Tidak ada dalam pilihan");
                continue;
            }else {
                garestia.konfirmasi(pilihan - 1);//konfirmasi pembelian
            }
            System.out.print("> ");
            int pil = input.nextInt();
            if (pil == 1) {
                garestia.transaksi(pilihan - 1, Rahmatia);//jika sama = 1 transaksi diproses
                System.out.print("> ");
                int pilihan2 = input.nextInt();
                if (pilihan2 == 1) {
                    continue;
                } else {
                    break; //jika transaksi tidak dilanjut maka program akan keluar
                }
            } else { //jika konfirmasi batal maka program akan berjalan terus (menampilkan list produk)
                continue;
            }
        }
        input.close();
    }
}

