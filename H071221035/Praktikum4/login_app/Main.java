

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static ArrayList<User> listUser = new ArrayList<User>(); //ArrayList<user> listuser yang menampung objek-objek dari kelas user
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>(); //ArrayList<profile> listuserprofile yang menampung objek-objek dari kelas profile
    static Scanner sc = new Scanner(System.in);
     // menggunakan metode static agar dapat digunakan tanpa memanggil class nya , sehingga dapat membuat objek tanpa instance class 
    public static void main(String[] args) {
        //memenaggil method run app
        runApp();
    }
    private static void runApp() {
        System.out.println("-".repeat(40));
        System.out.println("Selamat Datang di Aplikasi Login");
        System.out.println("-".repeat(40));
        System.out.println("1. Login");
        System.out.println("2. Buat Akun");
        System.out.println("-".repeat(40));
        System.out.print("> ");
        //menginput pilihan menu
        String input = sc.nextLine(); // inputan proses berupa string 
        switch (input) {
            case "1":
            //membuka halam login
                ShowLoginMenu();
                break;
            case "2":
            // membuka halaman register dan pembuatan user baru
                Register();
                break;
            default:
            //opsi jika inputan salah atau tidak valid maka akan kembali memanggil method run app
                System.out.println("Input tidak valid!");
                runApp();
                break; 
        }
    }

    private static void ShowLoginMenu() {
        //halaman login
        System.out.println("-".repeat(40));
        System.out.println("Silakan Login");
        System.out.println("-".repeat(40));
        //menginput username untuk disimpan di atribut username
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        //menginput password untuk disimpan di atribut password
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        // membuat perkondisian untuk mencari username , kondisi jika nilai user kosong, maka diminta input ulang
        User user = findUserByUsername(username); // untuk mencari user melalui username yang diiput , menggunakan user user karena berada di class user
        if (user == null) { // null artinya kosong,  berarti null karena dia tidak mendapatkan user yang cocok 
            System.out.println("Username tidak ditemukan!");
            ShowLoginMenu();
        } else {
            /*
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = user.getPassword().equals(password);  
            //equals untuk membandingkan password yang sudah tersimpan dengan password yang diinput , 
            //jika password cocok  maka user berhasil login
            if (isPasswordMatch) {
                System.out.println("-".repeat(40));
                System.out.println("Berhasil Login");  
                /*
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 * 
                 */
                showDetailUser(findProfileByUsername(username));
                runApp();
            } else {
                //kondisi jika password tdk memenuhi syarat akan diminta input ulang dengan method login
                System.out.println("-".repeat(40));
                System.out.println("Password salah!");
                System.out.println("-".repeat(40));
                ShowLoginMenu();
            }
        }
    }
        /*
        * Buatlah sebuah perkondisian (IF) yang akan
        * Mengecek apakah user index ke i dari listUser memiliki username yang sama
        * dengan username yang
        * diinput.
        * Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
        * perulangan
          */
     //method static untuk mengecek apakah nilai username dari objek user dari User sama dengan nilai username argumen method
    private static User findUserByUsername(String username) {
        //jika memenuhi syarat maka objek user akan dikembalikan
        for (User user : listUser) { // menggunakan operasi ternary yang menandakan bahwa jika true 
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null; // artinya tidak mengembalikan apa apa , harus diberikan return agar metode nya berjalan, jika tidak ada maka metode tidak berjalan
    }
    //method static untuk mengecek apakah nilai username dari objek user dari profil sama dengan nilai username argumen method
    private static Profile findProfileByUsername(String username) {
        //jika memenuhi syarat maka objek profil akan dikembalikan
        for (Profile profile : listUserProfile) { // tanda titik 2 berarti setiap profile yang ada di listuserprofile 
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        //jika tidak maka akan dikembalikan nilai null
        return null;
    }
    //method untuk membuat user baru
    private static void Register() {
        System.out.println("-".repeat(40));
        System.out.println("Silakan Isi Data Akun Baru :");
        System.out.println("-".repeat(40));
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();

        System.out.println("Umur");
        System.out.print("> ");
        while (!sc.hasNextInt()) {
            System.out.println("inputan harus berupa angka! ");
            System.out.println("Umur");
            System.out.print("> ");
            sc.next();
        }
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
        //validasi input username dan password
        while (username.equals("") || password.equals("")) {//akan terus meminta penginputan sampai semuanya valid
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            //kondisi jika input username kosong 
            if (username.equals("")) {
                System.out.println("Username tidak boleh kosong!");
                continue;//kembali keawal loop untuk melakukan validasi
            }
            //kondisi jika username sudah digunakan
            if (isUsernameExist(username)) {
                System.out.println("Username sudah digunakan!");
                username = ""; // agar disuruh mengisi ulang username 
                continue;//kembali keawal loop untuk melakukan validasi
            }
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (isPasswordExist(password)){
                System.out.println("password sudah digunakan");
                password = ""; // agar disuruh mengisi ulang password  
                continue; //kembali keawal loop untuk melakukan validasi
            }
        }
        /*
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        User user = new User();//instance objek
        user.setUserName(username);
        user.setPassword(password);
        /*
         * Buatlah atau Instance objek Profile baru
         */
        Profile profile = new Profile(fullName, age, hobby);
        
        /*
        * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
        * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
        * diinput sebelumnya
        */
        // untuk mengisi user yang ada di class profile
        profile.setUser(user);
        //menambahkan profile yang dibuat ke listUserprofile
        listUserProfile.add(profile);
        //menambahkan user yang dibuat ke listUser
        listUser.add(user);
        System.out.println("-".repeat(40));
        System.out.println("Akun Berhasil Dibuat!");
        System.out.println("-".repeat(40));

        /*
         * Tampilkan semua data profile user yang login
         */
        showDetailUser(profile);
        runApp();
    }
    //method untuk akun baru yang memiliki username yang sudah digunakan
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isPasswordExist(String password){
        for (User user : listUser){
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    //method untuk menampilkan detail user yang sudah diset
    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(40));
        System.out.println(" ".repeat(12) +"~ Detail User ~");
        System.out.println();
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Usia\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("-".repeat(40));
    }
}