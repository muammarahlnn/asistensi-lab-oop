class Kendaraan { 
    protected String merk = "Toyota"; 
    public void klakson() {
        System.out.println("Tiin, tiin!");
    }
}

class Mobil extends Kendaraan {
    private String namaModel = "Agya"; 
    public static void main(String[] args) {

        Mobil mobilSaya = new Mobil();
        
        mobilSaya.klakson();

        System.out.println(mobilSaya.merk + " " + mobilSaya.namaModel);
    }
}
