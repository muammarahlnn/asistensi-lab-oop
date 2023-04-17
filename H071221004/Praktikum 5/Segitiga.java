public class Segitiga extends BangunDatar {
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }


}
