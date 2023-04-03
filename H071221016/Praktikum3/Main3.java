import java.util.Scanner;

public class Main3 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        User user = new User("Nur",6000);

        Store store = new Store("Sisfo Komputer");
        // memasukkan barang ke list
        store.addProduct(new Product("Mac","10k",12));
        
        // memasukkan barang dengan method addproduct
        store.addProduct(new Product("HP Pavilion Gaming 15","2k",15));
        store.addProduct(new Product("ASUS VivoBook 15 A516MAO N4020","4k",4));
        store.addProduct(new Product("Lenovo IdeaPad",1500,2));

        while (true) {
            user.card();
            store.listProduct();
            System.out.print("> ");
            int pilihan1 = scan.nextInt();

            if (1 <= pilihan1 && pilihan1 <= store.getProduct().size()) {
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", store.getProduct().get(pilihan1 - 1).getName(), store.getProduct().get(pilihan1 - 1).getPrice());
                while (true) {
                    System.out.printf("1.Konfirmasi%n2.Batalkan%n");
                    System.out.println("> ");
                    int konfirmasi = scan.nextInt();
                    
                    if (konfirmasi == 1 && user.getBalance() >= store.getProduct().get(pilihan1 - 1).getPrice()) {
                        System.out.println("-".repeat(40));
                        store.getProduct().get(pilihan1 - 1).reduceStock(); 
                        user.setBalance(store.getProduct().get(pilihan1 - 1).getPrice());

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), store.getProduct().get(pilihan1 - 1).getName());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");

                        if (store.getProduct().get(pilihan1 - 1).getStock() <= 0) {
                            store.getProduct().remove(pilihan1 - 1);
                        }

                        int pilihan2 = scan.nextInt();
                        if (pilihan2 == 1) { 
                            break;
                        } else {
                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0); 
                        } 
                    } else if (konfirmasi == 2) { 
                        break;
                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), store.getProduct().get(pilihan1 - 1).getPrice(), (user.getBalance() < store.getProduct().get(pilihan1 - 1).getPrice()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");
                    }
                }
                
            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }
        }
        scan.close();
    }
}



