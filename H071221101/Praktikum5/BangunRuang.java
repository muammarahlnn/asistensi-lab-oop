public class BangunRuang {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;

    public BangunRuang(double nilaiA) {
        this.nilaiA = nilaiA;
    }

    public BangunRuang(double nilaiB, double nilaiC) {
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }

    public BangunRuang(double nilaiA, double nilaiB, double nilaiC) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }

}

class Kubus extends BangunRuang{

    public Kubus(double sisi){
        super(sisi);
    }
    public double luasPermukaan(){
        return 6 * nilaiA * nilaiA;
    }
    public double volume(){
        return nilaiA * nilaiA * nilaiA;
    }
}

class Balok extends BangunRuang{

    public Balok (double panjang, double lebar, double tinggi){
        super(panjang, lebar, tinggi);

    }
    public double luasPermukaan(){
        return 2 * nilaiA * nilaiB + nilaiA * nilaiC + nilaiB * nilaiC;
    }
    public double volume(){
        return nilaiA * nilaiB * nilaiC;
    }
}

class Bola extends BangunRuang{

    public Bola(double jariJari) {
        super(jariJari, jariJari);
    }
    public double luasPermukaan() {
        return 4 * Math.PI * nilaiA * nilaiA;
    }
    public double volume() {
        return 4 * Math.PI * nilaiA * nilaiA * nilaiA / 3;
    }
}

class Tabung extends BangunRuang{

    public Tabung(double jariJari, double tinggi) {
        super(jariJari, tinggi);

    }
    public double luasPermukaan() {
        return 2 * Math.PI * nilaiA * (nilaiA + nilaiB);
    }
    public double volume() {
        return Math.PI * nilaiA * nilaiA * nilaiB;
    }
}