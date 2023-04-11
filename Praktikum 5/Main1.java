public class Main1 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.setSisi(2);
        kubus.hitungLuasPermukaan();
        kubus.hitungVolume();

        Balok balok = new Balok();
        balok.setPanjang(2);
        balok.setLebar(3);
        balok.setTinggi(4);
        balok.hitungLuasPermukaan();
        balok.hitungVolume();

        Bola bola = new Bola();
        bola.setJarijari(2);
        bola.hitungLuasPermukaan();
        bola.hitungVolume();

        Tabung tabung = new Tabung();
        tabung.setJarijari(2);
        tabung.setTinggi(3);
        tabung.hitungLuasPermukaan();
        tabung.hitungVolume();

        Persegi persegi = new Persegi();
        persegi.setSisi(2);
        persegi.hitungLuas();
        persegi.hitungKeliling();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(2);
        persegiPanjang.setLebar(3);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJarijari(2);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(2);
        segitiga.setTinggi(3);
        segitiga.setSisiA(4);
        segitiga.setSisiB(2);
        segitiga.setSisiC(4);
        segitiga.hitungLuas();
        segitiga.hitungKeliling();

        Trapesium trapesium = new Trapesium();
        trapesium.setSisi1(2);
        trapesium.setSisi2(3);
        trapesium.setSisi3(4);
        trapesium.setSisi4(4);
        trapesium.hitungLuas();
        trapesium.hitungKeliling();
    }
}
