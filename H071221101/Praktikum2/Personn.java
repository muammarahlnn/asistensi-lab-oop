public class Personn {
    private String name;
    private int age;
    private boolean isMale;

    public Personn() {  
    }

    public Personn(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return this.isMale ? "Male" : "Female";
    }
 
    // class main
    public static void main(String[] args) {
        Personn person = new Personn();

        person.setName("L");
        person.setAge(18);
        person.setGender(true);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        Personn person2 = new Personn("R", 18, false);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Gender: " + person2.getGender());
    }
}

