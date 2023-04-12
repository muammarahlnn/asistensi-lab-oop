import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("===== Komunitas Programmer Unhas =====");
            System.out.println("1. Pengurus Inti");
            System.out.println("2. Koordinator Bidang");
            System.out.println("3. Staf");

            System.out.print("Masukkan jenis anggota: ");
            int jenis = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan nomor telepon: ");
            String noTelp = input.nextLine();

            System.out.print("Masukkan email: ");
            String email = input.nextLine();

            switch (jenis) {
                case 1:
                    System.out.print("Masukkan jabatan: ");
                    String jabatan = input.nextLine();

                    PengurusInti pengurus = new PengurusInti(nama, noTelp, email, jabatan);
                    pengurus.displayData();
                    break;

                case 2:
                    System.out.print("Masukkan bidang: ");
                    String bidang = input.nextLine();

                    KoordinatorBidang koordinator = new KoordinatorBidang(nama, noTelp, email, bidang);
                    koordinator.displayData();
                    break;

                case 3:
                    System.out.print("Masukkan tugas: ");
                    String tugas = input.nextLine();
                    Staf staf = new Staf(nama, noTelp, email, tugas);
                    staf.displayData();
                    break;
            }
        }
    }
}
