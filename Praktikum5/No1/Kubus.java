
class Kubus extends BangunRuang {
    double sisi;

    public Kubus() {
        
    }
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return 6 * sisi * sisi;
    }
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}
