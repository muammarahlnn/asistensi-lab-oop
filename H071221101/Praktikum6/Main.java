// public class Main2 {
//     public static void main(String[] args) {
//         // Create instances of each dog breed
//         Pitbull pitbull = new Pitbull(0, 25);
//         SiberianHusky husky = new SiberianHusky(0, 20);
//         Bulldog bulldog = new Bulldog(0, 18);
//         GermanShepherd shepherd = new GermanShepherd(0, 30);

//         // Move each dog and describe them
//         pitbull.move();
//         pitbull.describe();
//         husky.move();
//         husky.describe();
//         bulldog.move();
//         bulldog.describe();
//         shepherd.move();
//         shepherd.describe();

//         // Create instances of the smartphone and car
//         Smartphone smartphone = new Smartphone(1000, "Samsung");
//         Car car = new Car(5, "Red", 200);

//         // Move the smartphone and car
//         smartphone.move();
//         car.move();
//     }
// }
public class Main2 {
    public static void main(String[] args) {
      // Instance dari Pitbull
      Pitbull pitbull = new Pitbull(0, 60);
      pitbull.move(); // Pitbull bergerak ke kanan
      pitbull.describe(); // Deskripsi mengenai Pitbull
  
      // Instance dari SiberianHusky
      SiberianHusky husky = new SiberianHusky(0, 70);
      husky.move(); // SiberianHusky bergerak ke kanan
      husky.describe(); // Deskripsi mengenai SiberianHusky
  
      // Instance dari Bulldog
      Bulldog bulldog = new Bulldog(0, 40);
      bulldog.move(); // Bulldog bergerak ke kanan
      bulldog.describe(); // Deskripsi mengenai Bulldog
  
      // Instance dari GermanShepherd
      GermanShepherd shepherd = new GermanShepherd(0, 65);
      shepherd.move(); // GermanShepherd bergerak ke kanan
      shepherd.describe(); // Deskripsi mengenai GermanShepherd
  
      // Instance dari SamsungSmartphone
      Smartphone smartohone = new Hp (3000000, "iPhone");
      smartohone.move(); // Smartphone berpindah
  
      // Instance dari ToyotaCar
      ToyotaCar toyota = new ToyotaCar(6, "Silver", 220);
      toyota.move(); // Mobil sedang berakselerasi
    }
  }
  
// public class Main {
//     public static void main(String[] args) {
//       // Instance dari SamsungSmartphone
//       Smartphone samsung = new SamsungSmartphone(3000000, "Samsung");
//       samsung.move(); // Output: Smartphone berpindah
  
//       // Instance dari ToyotaCar
//       Car toyota = new ToyotaCar(6, "Silver", 220);
//       toyota.move(); // Output: Mobil sedang berakselerasi
  
//       // Instance dari GermanShepherd
//       Dog germanShepherd = new GermanShepherd(0, 65);
//       germanShepherd.move(); // GermanShepherd bergerak ke kanan
//       germanShepherd.describe(); // Deskripsi mengenai GermanShepherd
//     }
//   }