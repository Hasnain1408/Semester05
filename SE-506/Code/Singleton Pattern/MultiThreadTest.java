import java.util.Scanner;

public class MultiThreadTest {
    public static void main(String[] args) {
        
        System.out.println("1.Modern\n2.Victorian\n3.Rustic\n0-Stop");
        System.out.println("Enter choice :");
         int choice;
    
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



        final FurnitureFactory selectedFactory = factory;

        Runnable task = () -> {
            FurnitureStore client = new FurnitureStore(selectedFactory);
            client.UseFurniture();

           
        };

        Thread thread1 = new Thread(task);
        thread1.start();
        Thread thread2 = new Thread(task);
        thread2.start();
        Thread thread3 = new Thread(task);
        thread3.start();





        try {
          thread1.join();
          thread2.join();
          thread3.join();
      } 
      catch (InterruptedException e) {
          e.printStackTrace();
      }

        scanner.close();
    }
}
