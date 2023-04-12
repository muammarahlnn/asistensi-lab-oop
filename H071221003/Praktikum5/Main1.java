public class Main1 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(3);
        kubus.hitungLuasPermukaan();
        kubus.hitungVolume();

        Balok balok = new Balok();
        balok.setPanjang(4);
        balok.setLebar(3);
        balok.setTinggi(2);
        balok.hitungLuasPermukaan();
        balok.hitungVolume();

        Bola bola = new Bola();
        bola.setJarijari(3);
        bola.hitungLuasPermukaan();
        bola.hitungVolume();

        Tabung tabung = new Tabung();
        tabung.setJarijari(3);
        tabung.setTinggi(3);
        tabung.hitungLuasPermukaan();
        tabung.hitungVolume();

        Persegi persegi = new Persegi();
        persegi.setSisi(3);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(4);
        persegiPanjang.setLebar(3);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(3);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(2);
        segitiga.setTinggi(4);
        segitiga.setSisiA(3);
        segitiga.setSisiB(2);
        segitiga.setSisiC(3);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();

        Trapesium trapesium = new Trapesium();
        trapesium.setSisi1(3);
        trapesium.setSisi2(3);
        trapesium.setSisi3(2);
        trapesium.setSisi4(3);
        trapesium.setTinggi(3);
        trapesium.hitungLuas();
        trapesium.hitungKeliling();
    }
}
