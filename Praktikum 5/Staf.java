class Staf extends Anggota {
    private String tugas;

    public Staf(String n, String t, String e, String tt) {
        super(n, t, e);
        tugas = tt;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Tugas\t\t: " + tugas);
    }
}