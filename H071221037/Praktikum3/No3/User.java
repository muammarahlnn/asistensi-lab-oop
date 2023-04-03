public class User {
    //atribut class user
    String name;
    int balance;

    // constructor atribut name dan balance
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    //setter dan getter untuk menset nilai dan mengambil nilai
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    // behaviour untuk menampilkan nama dan uang user
    public void card() {
        System.out.println("-------------CARD------------");
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println("-----------------------------");
    }
}
