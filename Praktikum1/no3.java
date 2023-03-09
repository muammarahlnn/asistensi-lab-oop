import java.util.Scanner; 

public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //untuk bikin variabel inputan
        
        try {
            
            System.out.print("Name : ");        // -> bukan println biar yg diinput jdi ke samping
            String name = sc.nextLine();            // nextLine -> biar namanya bisa >= 2                                    
            
            System.out.print("Umur : ");
            int age = sc.nextInt(); 
            sc.nextLine();                          // biar bisa input hobby
            
            System.out.print("Hobby : ");
            String hobby = sc.nextLine();           // nextLine -> biar hobbynya bisa >= 2
            
            System.out.println("Nama saya "+ name + ", " + age + " tahun, " + "hobby " + hobby);
            
            sc.close(); //kalau ndd inputnya ini resource leak jadi inputan sllu berjalan jadi penyimpangan di memori

        } catch (Exception e) {
            System.out.println("input bukan angka"); 
        }
    }
}