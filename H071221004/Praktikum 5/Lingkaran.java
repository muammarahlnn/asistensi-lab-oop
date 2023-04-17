public class Lingkaran extends BangunDatar {

    protected double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

}
