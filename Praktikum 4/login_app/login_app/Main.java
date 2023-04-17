package login_app;


import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;

public class Main {

    static ArrayList<User> listUser = new ArrayList<User>();
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>();
    static Scanner sc = new Scanner(System.in);

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
        System.out.println("3. Keluar");
        System.out.println("-".repeat(40));
        System.out.print("> ");
        //menginput pilihan menu
        String input = sc.nextLine();
        switch (input) {
            case "1":
            //membuka halam login
                login();
                break;
            case "2":
            // membuka halaman register dan pembuatan user baru
                createNewUser();
                break;
            case "3":
            //opsi untuk keluar dari aplikasi
                System.out.println("-".repeat(45));
                System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                System.out.println("-".repeat(45) + "\n");
                System.exit(0);
                break;
            default:
            //opsi jika inputan salah atau tidak valid maka akan kembali memanggil method run app
                System.out.println("Input tidak valid!");
                runApp();
                break;
        }
    }

    private static void login() {
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
        User user = findUserByUsername(username);
        //kondisi jika nilai user kosong, maka diminta input ulang
        if (user == null) {
            System.out.println("Username tidak ditemukan!");
            login();
        } else {

            /*
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */

            boolean isPasswordMatch = user.getPassword().equals(password);
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
                login();
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

    private static User findUserByUsername(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    //method static untuk mengecek apakah nilai username dari objek user dari profil sama dengan nilai username argumen method
    private static Profile findProfileByUsername(String username) {
        //jika memenuhi syarat maka objek profil akan dikembalikan
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        //jika tidak maka akan dikembalikan nilai null
        return null;
    }

    //method untuk membuat user baru
    private static void createNewUser() {
        System.out.println("-".repeat(40));
        System.out.println("Silakan Isi Data Akun Baru :");
        System.out.println("-".repeat(40));
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = validateIntegerInput();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
        //validasi input username dan password
        while (username.isEmpty() || password.equals("")) {//akan terus meminta penginputan sapai semuanya valid
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
                username = "";
                continue;//kembali keawal loop untuk melakukan validasi
            }
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            //kondisi untuk menghandle jika panjang karakter password kurang dari 8
            if (password.length() < 8) {
                System.out.println("Password harus lebih dari 8 karakter!");
                password = "";//mengosongkan kembali nilai variabel password
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

        /*
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        Profile profile = new Profile(fullName, age, hobby, password);
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
    //method untuk menampilkan detail user yang sudah diset
    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(40));
        System.out.println(" ".repeat(12) +"~ Detail User ~");
        System.out.println();
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Usia\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("Username\t: " + profile.getUser().getUserName());
        System.out.println("-".repeat(40));
    }
    //method yang mengharuskan inputan harus berupa integer
    private static int validateIntegerInput() {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
                System.out.print("> ");
            }
        }
        return result;
    }
}