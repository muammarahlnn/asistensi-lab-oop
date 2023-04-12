package login_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<User> listUser = new ArrayList<User>();
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Selamat Datang di Aplikasi Login");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Buat Akun");
        System.out.println("3. Keluar");
        System.out.println("-------------------------");
        System.out.print("> ");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                login();
                break;
            case "2":
                createNewUser();
                break;
            case "3":
                System.out.println("Terima kasih telah menggunakan aplikasi kami!");
                System.exit(0);
                break;
            default:
                System.out.println("Input tidak valid!");
                runApp();
                break;
        }
    }

    private static void login() {
        System.out.println("-------------------------");
        System.out.println("Silakan Login");
        System.out.println("-------------------------");
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Username tidak ditemukan!");
            login();
        } else {
            boolean isPasswordMatch = user.getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(findProfileByUsername(username));
                runApp();
            } else {
                System.out.println("Password salah!");
                login();
            }
        }
    }

    private static User findUserByUsername(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static Profile findProfileByUsername(String username) {
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        return null;
    }

    private static void createNewUser() {
        System.out.println("-------------------------");
        System.out.println("Silakan Isi Data Berikut Untuk Membuat Akun Baru:");
        System.out.println("-------------------------");
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
        while (username.equals("") || password.equals("")) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            if (username.equals("")) {
                System.out.println("Username tidak boleh kosong!");
                continue;
            }
            if (isUsernameExist(username)) {
                System.out.println("Username sudah digunakan!");
                username = "";
                continue;
            }
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password harus lebih dari 8 karakter!");
                password = "";
            }
        }
        User user = new User();
        user.setUserName(username);
        user.setPassword(password);
        Profile profile = new Profile(fullName, age, hobby, password);
        profile.setUser(user);
        listUserProfile.add(profile);
        listUser.add(user);
        System.out.println("-------------------------");
        System.out.println("Akun Berhasil Dibuat!");
        System.out.println("-------------------------");
        showDetailUser(profile);
        runApp();
    }

    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("Detail User:");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nama Panggilan: " + profile.getNickName());
        System.out.println("Usia: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("Username: " + profile.getUser().getUserName());
        System.out.println("-------------------------");
    }

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