public class Bola extends BangunRuang{

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume(){
        return 4/3 * Math.PI * Math.pow(jariJari, 3);
    }

    public double hitungLuasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}
