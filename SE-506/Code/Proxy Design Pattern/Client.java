import java.util.Scanner;

public class Client {
    public static void main(String[] args) {


         Image[] images = {
            new ImageProxy("Photo1.jpg"),
            new ImageProxy("Photo2.jpg"),
            new ImageProxy("Photo3.jpg")
        };

        
        System.out.println("\nUser selects Photo1.jpg to view:");
        images[0].display(); 
        images[0].display(); 
        System.out.println("\nUser selects Photo2.jpg to view:");
        images[0].display(); 
         



    }
}
