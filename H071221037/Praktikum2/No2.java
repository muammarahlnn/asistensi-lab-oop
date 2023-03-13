public class No2 {
    public static void main(String[]args){
        // membuat objek dari class
        Person data = new Person();
        // inputan
        data.setName("Muhammad Reza");
        data.setAge(18);
        data.setGender(true);
        //output
        System.out.println("Nama Saya : "+ data.getName());
        System.out.println("Umur Saya : "+ data.getAge());
        System.out.println("Jenis Kelamin : "+ (data.getGender() ? "Laki - laki" : "Perempuan"));

    }
}  

