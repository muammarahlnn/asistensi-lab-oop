class Anggota {
    private String nama;
    private String noTelp;
    private String email;

    public Anggota(String n, String t, String e) {
        nama = n;
        noTelp = t;
        email = e;
    }

    public void displayData() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nomor Telepon\t: " + noTelp);
        System.out.println("Email\t\t: " + email);
    }
}