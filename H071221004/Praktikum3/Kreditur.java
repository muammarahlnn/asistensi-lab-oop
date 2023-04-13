// NO 1
public class Kreditur {
    // atribut string class kreditur
    String namaKreditur, alamat;
    //atribut user devined variabel dari class MedsosKreditur
    MedsosKreditur medsos;
    //atribut int class kreditu
    long totalUang, uangDipinjam, sisaUang;

    //method setter untuk memberi nilai pada masing" atribut
    //method getter untuk mengambil nilai pada masing" atribut
    public void setNama(String namaKreditur){
        this.namaKreditur = namaKreditur;
    }
    public String getNama(){
        return namaKreditur;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat;
    }
    //method setter getter dengan tipe data class lain (user devined variabel) yang diakses di classs medsosKreditur
    public void setMedsos(MedsosKreditur medsos){
        this.medsos = medsos;
    }
    public MedsosKreditur getMedsos(){
        return medsos;
    }
    //constructor untuk memberi nilai awal pada saat pembuatan objek
    public Kreditur(){

    }
    public Kreditur(long totalUang){
        this.sisaUang = totalUang;
        this.uangDipinjam = 0;
    }
    public Kreditur( String namaKreditur, String alamat, MedsosKreditur medsos, long totalUang){
        this.namaKreditur = namaKreditur;
        this.alamat = alamat;
        this.medsos = medsos;
        this.totalUang = totalUang;
    }
    public long getTotalUang(){
        return this.totalUang;
    }
    public long getUangDipinjam(){
        return this.uangDipinjam;
    }
    public long getSisaUang(){
        return this.sisaUang;
    }
    // behaviour untuk menghitung uang pinjaman
    public void peminjaman(long value){
        System.out.println("uang telah dipinjam");
        this.totalUang -= value;
        this.sisaUang = totalUang;
        System.out.println("sisa uang pinjaman Rp" + this.totalUang);
        this.uangDipinjam +=value;
    }
    // behaviour untuk menghitung uang pembayaran
    public void pembayaran(long value){
        System.out.println("pembayaran telah berhasil");
        this.uangDipinjam -= value;
        this.sisaUang += value;
        this.totalUang = sisaUang;
        System.out.println("total uang setelah pembayaran Rp" + this.totalUang + "\n");

    }
    //behaviour untuk menampilkan rincian uang kreditur
    public void cekNominalUang(){
        System.out.println("> Rincian arus kas kreditur <");
        System.out.println("total uang \t: Rp" + this.totalUang);
        System.out.println("sisa uang \t: Rp" + this.sisaUang);
        System.out.println("uang dipinjam \t: Rp" + this.uangDipinjam + "\n");
    }
    //behaviour untuk menampilkan profil kreditur
    public void ProfilKreditur(){
        System.out.println("\n===============================================");
        System.out.println("| ---------------Profil Kreditur------------- |");
        System.out.println("===============================================");
        System.out.println("| nama kreditur :  " + namaKreditur.toUpperCase() + "\t\t      |");
        System.out.println("| alamat \t:  " + alamat + "\t\t      |");
        System.out.println("| hubungi kreditur lewat media sosial  \t      |" + medsos.getMedsos() + "\t");
        System.out.println("===============================================");
        System.out.println("| total dana kreditur sebesar Rp" + totalUang + "  |");
        System.out.println("===============================================");
    }
    
    
}
