public class Tabung extends BangunRuang {
    
    protected double jariJari;
    protected double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}
