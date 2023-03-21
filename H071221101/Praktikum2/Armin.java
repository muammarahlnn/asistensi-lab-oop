public class Armin {
    String name;
    int age;
    String devision;

    public Armin (String name, int age, String devsion) {
        this.name = name;
        this.age = age;
        this.devision = devsion;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDevision(String devison) {
        this.devision = devison;
    }


    public void introduce() {
        System.out.println("Hello, my name is " + name + ", and I'm " + age + " years old. I'm a " + devision + ".");
           //System.out.println("Name =" + name);
           //System.out.println("age = " + age);
           //System.out.println("devision = " + age);
          
    }

    public static void main(String[] args) {
        Armin armin = new Armin("Armin Arlert", 17, "Survey Corps");
        armin.introduce();
        armin.setName("Eren Yeager");
        armin.introduce();
        armin.name = "mikasa";
        armin.introduce();
    }
}