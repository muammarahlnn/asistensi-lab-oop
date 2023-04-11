class KoordinatorBidang extends Anggota {
    private String bidang;

    public KoordinatorBidang(String n, String t, String e, String b) {
        super(n, t, e);
        bidang = b;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Bidang\t\t: " + bidang);
    }
}
