public class BangunDatar {
    protected double nilaiA;
    protected double nilaiB;
    protected double nilaiC;
    protected double nilaiD;

    public BangunDatar(double nilaiA) {
        this.nilaiA = nilaiA;
    }

    public BangunDatar(double nilaiA, double nilaiB) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
    }

    public BangunDatar(double nilaiA, double nilaiB, double nilaiC) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
    }
 
    public BangunDatar(double nilaiA, double nilaiB, double nilaiC, double nilaiD) {
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        this.nilaiD = nilaiD;
    }

    // public double getKeliling(){
    //     return keliling;
    // }

    // public double getLuas() {
    //     return luas;
    // }
}

class Persegi extends BangunDatar{

    public Persegi(double sisi){
        super(sisi);
    }
    public double keliling(){
        return  4 * nilaiA;
    }
    public double luas(){
        return nilaiA * nilaiA;
    }
}

class PersegiPanjang extends BangunDatar{

    public PersegiPanjang(double panjang, double lebar){
        super(panjang, lebar);
    }
    public double keliling(){
        return 2 * (nilaiA + nilaiB );
    }
    public double luas(){
        return nilaiA * nilaiB ;
    }
}

class Lingkaran extends BangunDatar{

    public Lingkaran(double jariJari){
        super(jariJari);
    }
    public double keliling(){
        return 2 * Math.PI * nilaiA;
    }
    public double luas(){
        return Math.PI * nilaiA * nilaiA;
    }
}

class Segitiga extends BangunDatar{

    public Segitiga(double alas, double tinggi, double sisi){
        super(alas, tinggi, sisi);

    }
    public double keliling(){
        return nilaiA + nilaiB + nilaiC;
    }
    public double luas(){
        return nilaiA * nilaiB / 2;
    }
}

class Trapesium extends BangunDatar{


    public Trapesium(double tinggi, double alas, double sisimiring, double atas) {
        super(tinggi, alas, sisimiring, atas);
    }
    public double keliling(){
        return nilaiB + nilaiC * 2 + nilaiD;
    }

    public double luas(){
        return ((nilaiB + nilaiD) * nilaiA)/2;
    }
}