import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //instansiasi class user
        User Reza = new User("Reza", 100_000_000);
        //instansiasi class product
        Product Handphone = new Product("Asus ROG Phone 6", "27000k", 1);
        Product Laptop = new Product("Asus ROG Zephyrus", "20000k", 2);
        Product Motor = new Product("Yamaha R25", "71000k", 3);
        Product Mobil = new Product("Toyota Rush", 97_000_000, 3);
        //instasiasi class store
        Store myStore = new Store("myStore");
        //panggil behaviour tambah produk untuk menambah produk dalam array list
        myStore.tambahProduct(Handphone);
        myStore.tambahProduct(Laptop);
        myStore.tambahProduct(Motor);
        myStore.tambahProduct(Mobil);
        //membuat perulangan untuk proses transaksi
        while (true) {
            Reza.card(); //menampilkan info user
            myStore.listProduct(); // menampilkan list produk
            System.out.println("O. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();//masukkan inputan
            if (pilihan == 0) {
                break;
            }else if(pilihan > myStore.productList.size()){
                System.out.println("Tidak ada dalam pilihan");
                continue;
            }else {
                myStore.konfirmasi(pilihan - 1);//konfirmasi pembelian
            }
            System.out.print("> ");
            int pil = input.nextInt();
            if (pil == 1) {
                myStore.transaksi(pilihan - 1, Reza);//jika sama = 1 transaksi diproses
                System.out.print("> ");
                int pilihan2 = input.nextInt();
                if (pilihan2 == 1) {
                    continue;
                } else {
                    break; //jika transaksi tidak dilanjut maka program akan keluar
                }
            }else if (pil == 2) {
                continue;
            }
            else  { //jika konfirmasi batal maka program akan berjalan terus (menampilkan list produk)
                System.out.println("Tidak ada dalam pilihan");
                continue;
                
            }
        }
        input.close();
    }
}

