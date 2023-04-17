class KoordinatorBidangdanStaf extends Anggota {
    // Method untuk menampilkan daftar nama koordinator beserta jabatannya
    public void tampilkanKoordinator() {
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(6) + "Koordinator  Bidang dan Staf");
        System.out.println("=".repeat(40));
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
        System.out.println("=".repeat(40) + "\n");
    }
}