class Balok extends BangunRuang{
    double panjang;
    double lebar;
    double tinggi;

    public Balok() {
        
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }        
    public double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
