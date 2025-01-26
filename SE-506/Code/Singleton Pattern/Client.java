import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("1.Modern\n2.Victorian\n3.Rustic\n0-Stop");
        System.out.println("Enter choice :");
         int choice;
        do {
         Scanner scanner = new Scanner(System.in);
         choice = scanner.nextInt();


        FurnitureFactory factory = null;
        if (choice == 1) {
            factory = ModernFurnitureFactory.getInstance();
           } else if (choice == 2) {
            factory = VictorianFurnitureFactory.getInstance();
           } else if (choice == 3) {
      
            factory =  RusticFurnitureFactory.getInstance();
           }

            assert factory != null;
            FurnitureStore store = new FurnitureStore(factory);
           store.UseFurniture();
           
          }while(choice != 0);
      
         }


}





