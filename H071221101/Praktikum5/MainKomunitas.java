public class MainKomunitas {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Akaashi", 19, "Laki-laki", "Ketua");
        System.out.println("Nama : " + pengurusInti.getName());
        System.out.println("Umur : " + pengurusInti.getAge());
        System.out.println("Gender : " + pengurusInti.getGender());
        System.out.println("Jabatan : " + pengurusInti.getJabatan());


        KordinatorBidangStaff koordinasiBidangStaff = new KordinatorBidangStaff("L", 18," Perempuan","Sekretaris");
        System.out.println("Nama : " + koordinasiBidangStaff.getName());
        System.out.println("Umur : " + koordinasiBidangStaff.getAge());
        System.out.println("Gender : " + koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " + koordinasiBidangStaff.getBidang());
    }
}
