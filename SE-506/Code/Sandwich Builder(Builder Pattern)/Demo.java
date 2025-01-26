import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Director director = new Director();
        SandwichBuilder builder = new SandwichBuilder();

        // Create a Chicken Sandwich
        director.constructChickenSandwich(builder);
        Sandwich chickenSandwich = builder.getResult();
        System.out.println("Sandwich with :" + chickenSandwich.getSandwidch());

        SandwichDetailsBuilder detailsBuilder = new SandwichDetailsBuilder();
        director.constructChickenSandwich(detailsBuilder);
        SandwichDetails details = detailsBuilder.getResult();
        System.out.println("\nSandwich Details built:\n" + details.result());

        

        // Create a custom sandwich
        Scanner scanner = new Scanner(System.in);
        String bread = scanner.nextLine();
        String filling = scanner.nextLine();
        String spread = scanner.nextLine();
        scanner.close();
        
        SandwichBuilder customBuilder = new SandwichBuilder();
        customBuilder.setBread(bread);
        customBuilder.setFilling(filling);
        customBuilder.setSpread(spread);
        Sandwich customSandwich = customBuilder.getResult();
        System.out.println("Custom Sandwich with : " + customSandwich.getSandwidch());

        SandwichDetailsBuilder customDetailsBuilder = new SandwichDetailsBuilder();
        customDetailsBuilder.setBread(bread);
        customDetailsBuilder.setFilling(filling);
        customDetailsBuilder.setSpread(spread);
        SandwichDetails customSandwichDetails = customDetailsBuilder.getResult();
        System.out.println("\nSandwich Details built:\n" + customSandwichDetails.result());
        
       
    }
}
