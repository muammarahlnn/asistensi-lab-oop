package login_app;

public class User {
    //atrribute
    private String username;
    private String password;
    private Profile profile; // untuk menyimpan informasi profil dari user
 
    public User(){}  //constructor dengan parameter kosong

    public User(String username, String password, Profile profile) { // constructor dengan 3 parameter
        this.username = username;
        this.password = password;
        this.profile = profile;
    }

    public User(String username, String password){ // constructor dengan 2 parameter
        this.username = username;
        this.password = password;
    }

   
    public void setUserName(String username) {
        this.username = username;
    }
    public String getUserName() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public Profile getProfile() {
        return profile;
    }
}
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */