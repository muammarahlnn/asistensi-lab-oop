public class Main{
  public static void main(String[] args) {
      System.out.println("\n");
      SiberianHusky siberianHusky = new SiberianHusky(0, 58);
      System.out.println("Posisi Siberian Husky : " + siberianHusky.position);
      siberianHusky.move();
      System.out.println("Panjang rata-rata : " + siberianHusky.averageLength);
      siberianHusky.describe();
      System.out.println("\n");

      Smartphone smartphone = new Smartphone(10000000, "Iphone 11");
      System.out.println("Nama Barang : " + smartphone.brand);
      System.out.println("Harga       : " + smartphone.price);
      smartphone.move();
      System.out.println("\n");

      Car car = new Car(6, "Putih", 325);
      System.out.println("Foward Gear : " + car.totalForwardGear);
      System.out.println("Warna Mobil : " + car.color);
      System.out.println("Top Speed   : " +car.maxSpeed);
      car.move();
  }
}