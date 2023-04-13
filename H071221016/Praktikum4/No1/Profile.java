package login_app;

public class Profile {
    private String fullName;
    private int age;
    private String hobby;
    private String nickName; //nama panggilan
    private User user; // untuk menyimpan informasi dari class user

    public Profile (){} //constructor kosong

    public Profile(String fullName, int age, String hobby) { //constructor 3 parameter
        this.fullName = fullName;
        this.age = age;
        this.hobby = hobby;
        this.nickName = StringUtils.getNickName(fullName); //mengambil nickname dari suatu nama lengkap (fullName) yang diberikan
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getNickName() {
        return nickName;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public User getUser() {
        return user;
    }
}
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */