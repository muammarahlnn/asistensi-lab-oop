class Tabung extends BangunRuang {
    double jari2;
    double tinggi;
    
    public Tabung() {
        
    }
    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double hitungLuas() {
        return 2 * Math.PI * jari2 * (jari2);
    }
    public double hitungVolume() {
        return Math.PI * jari2 * jari2 * tinggi;
    }
}
