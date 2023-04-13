import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" === BANGUN RUANG ==== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG\n\n");
        System.out.println(" ==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");

        System.out.print("> ");
        int choise = scan.nextInt();
        System.out.println(" ====================== ");
        switch(choise) {
            case 1:
            Kubus kubus = new Kubus();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = scan.nextDouble();
            kubus.setSisi(angka);
            System.out.println("Luas Permukaan : " + kubus.hitungLuas());
            System.out.println("Volume         : " + kubus.hitungVolume());
            break;
            case 2:
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok : ");
            Double angka1 = scan.nextDouble();
            balok.setPanjang(angka1);
            System.out.print("Masukkan lebar balok  : ");
            Double angka2 = scan.nextDouble();
            balok.setLebar(angka2);
            System.out.print("Masukkan tinggi balok : ");
            Double angka3 = scan.nextDouble();
            balok.setTinggi(angka3);
            System.out.println("Luas Permukaan : " + balok.hitungLuas());
            System.out.println("Volume         : " + balok.hitungVolume());
            break;
            case 3:
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola : ");
            Double angka4 = scan.nextDouble();
            bola.setJari2(angka4);
            System.out.println("Luas Permukaan : " + bola.hitungLuas());
            System.out.println("Volume         : " + bola.hitungVolume());
            break;
            case 4:
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung : ");
            Double angka5 = scan.nextDouble();
            tabung.setJari2(angka5);

            System.out.print("Masukkan tinggi tabung : ");
            Double angka6 = scan.nextDouble();
            tabung.setTinggi(angka6);

            System.out.println("Luas Permukaan : " + tabung.hitungLuas());
            System.out.println("Volume         : " + tabung.hitungVolume());  
            break;
            case 5:
            Persegi persegi = new Persegi();
            System.out.print("Masukkan panjang sisi : ");
            Double angka7 = scan.nextDouble();
            persegi.setSisi(angka7);

            System.out.println("Keliling : " + persegi.hitungKeliling());
            System.out.println("Luas     : " + persegi.hitungLuas());
            break;
            case 6:
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Masukkan panjang : ");
            Double angka8 = scan.nextDouble();
            persegiPanjang.setPanjang(angka8);

            System.out.print("Masukkan lebar : ");
            Double angka9 = scan.nextDouble();
            persegiPanjang.setLebar(angka9);

            System.out.println("Keliling : " + persegiPanjang.hitungKeliling());
            System.out.println("Luas     : " + persegiPanjang.hitungLuas()); 
            break;
            case 7:
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari : ");
            Double angka10 = scan.nextDouble();
            lingkaran.setjari2(angka10);

            System.out.println("Keliling : " + lingkaran.hitungKeliling());
            System.out.println("Luas     : " + lingkaran.hitungLuas());
            break;
            case 8:
            Segitiga segitiga = new Segitiga();
            System.out.print("Masukkan alas : ");
            Double angka11 = scan.nextDouble();
            segitiga.setAlas(angka11);

            System.out.print("Masukkan sisi kiri : ");
            Double angka12 = scan.nextDouble();
            segitiga.setSisikiri(angka12);

            System.out.print("Masukkan sisi kanan : ");
            Double angka13 = scan.nextDouble();
            segitiga.setSisikanan(angka13);

            System.out.print("Masukkan tinggi : ");
            Double angka14 = scan.nextDouble();
            segitiga.setTinggi(angka14);

            System.out.println("Keliling : " + segitiga.hitungKeliling());
            System.out.println("Luas     : " + segitiga.hitungLuas());
            break;
            case 9:
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan alas : ");
            Double angka15 = scan.nextDouble();
            trapesium.setAlas(angka15);

            System.out.print("Masukkan sisi miring : ");
            Double angka16 = scan.nextDouble();
            trapesium.setSisimiring(angka16);

            System.out.print("Masukkan atas : ");
            Double angka17 = scan.nextDouble();
            trapesium.setAtas(angka17);

            System.out.print("Masukkan tinggi : ");
            Double angka18 = scan.nextDouble();
            trapesium.setTinggi(angka18);

            System.out.println("Keliling : " + trapesium.hitungKeliling());
            System.out.println("Luas     : " + trapesium.hitungLuas());
            break;
        }
    }
  
}
