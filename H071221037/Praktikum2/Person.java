public class Person {
    String name ;
    int age ;
    boolean isMale ;

    // method set 
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setGender(boolean isMale){
        this.isMale = isMale;
    }
    // method get
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    boolean getGender(){
        return isMale;
    }
    
}
