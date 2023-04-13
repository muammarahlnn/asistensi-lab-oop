class Bola extends BangunRuang {
    double jari2;
    
    public Bola() {
    }
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
    public double hitungLuas() {
        return 4 * Math.PI * jari2 *jari2;
    }
    public double hitungVolume() {
        return 4/3 * Math.PI * jari2 * jari2 * jari2;
    }
}
