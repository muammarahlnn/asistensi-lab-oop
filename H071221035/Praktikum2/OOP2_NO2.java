public class OOP2_NO2 {
    public static void main(String[] args) {
        //OBJEK
    Person objek = new Person();
    objek.setName("Muh. Ilham Maulana");
    objek.setAge(19);
    objek.setIsMale(true);
    
    System.out.println("NAMA : "+objek.getName());
    System.out.println("UMUR :"+objek.getAge());
    System.out.println("JENIS KELAMIN : "+objek.getGender());
    }

}
// membuat class
class Person{
    //ATRIBUT
    String name;
    int age;
    boolean isMale;
//method
    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }
    
    void setIsMale(boolean isMale){
        this.isMale = isMale;
    }

    String getName(){
        return name; 
    }
    int getAge(){
        return age;
    }
    boolean getIsMale(){
        return isMale;
    }

    String getGender(){
        if (isMale){
            return "PRIA";
        }else {
            return "WANITA";
        }
    }

    }
