class PengurusInti extends Anggota {
    // Method untuk menampilkan daftar nama pengurus inti beserta jabatannya
    public void tampilkanPengurusInti() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println(" ".repeat(13) + "Pengurus Inti");
        System.out.println("=".repeat(40));
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
    }
}