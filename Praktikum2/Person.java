public class Person {
    private String name;
    private int age;
    private boolean isMale;

    // return untuk mengembalikan nilai atribut
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // setGender untuk memperbarui nilai atribut yang ada
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    // getGender untuk mengambil nilai atribut yang sudah diperbarui
    public String getGender() {
        return isMale ? "laki-laki" : "perempuan";
    }
}
