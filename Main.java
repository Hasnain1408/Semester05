import java.util.Scanner;

public class Main{
   public static void main(String[] args){


     System.out.println("1.Smartphone\n2.Laptop\n3.Tablet\n0-Stop");
     System.out.println("Enter choice :");
    int choice;
    do {
     Scanner scanner = new Scanner(System.in);
     choice = scanner.nextInt();

     if (choice == 1) {
      SmartphoneFactory smartphoneFactory = new SmartphoneFactory();
      Smartphone smartphone = (Smartphone) smartphoneFactory.createDevice();
      smartphone.powerOn();
      smartphone.powerOf();
      smartphone.playMusic();
      Smartphone sm = new Smartphone();
      sm.playMusic();
      sm.powerOn();
     } else if (choice == 2) {
      LaptopFactory laptopFactory = new LaptopFactory();
      Laptop laptop = (Laptop) laptopFactory.createDevice();
      laptop.powerOn();
      laptop.powerOf();
      laptop.runLaptop();
     } else if (choice == 3) {

      TabletFactory tabletFactory = new TabletFactory();
      Tablet tablet = (Tablet) tabletFactory.createDevice();
      tablet.powerOn();
      tablet.powerOf();
      tablet.watchVideo();
     }
    }while(choice != 0);

   }
}