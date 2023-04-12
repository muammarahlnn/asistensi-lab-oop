class PengurusInti extends SistemInformasi {
    private String jabatan;

    public PengurusInti(String n, String t, String e, String j) {
        super(n, t, e);
        jabatan = j;
    }

    public void displayData() {
        super.displayData();
        System.out.println("Jabatan\t\t: " + jabatan);
    }
}