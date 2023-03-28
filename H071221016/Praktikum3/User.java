public class User {
    // Atribut
    private String nameUser;
    private int balance;
    // Constructor
    public User(String nameUser,int balance){
        this.nameUser = nameUser;
        this.balance = balance;
    }
    public String getName() {
        return nameUser;
    }
    public void setBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public int getBalance() {
        return balance;
    }
    // Behavior
    public void  card() {
        System.out.println("-".repeat(18)+"CARD"+"-".repeat(18));
        System.out.println(this.getName());
        System.out.println(this.getBalance());
        System.out.println("-".repeat(40));
    }  
}
