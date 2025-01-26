// Client code
public class Main {
    public static void main(String[] args) {
        System.out.println("Preparing Coffee:");
        BeverageTemplate coffee = new Coffee();
        coffee.prepareBeverage();

        System.out.println("\nPreparing Tea:");
        BeverageTemplate tea = new Tea();
        tea.prepareBeverage();
    }
}
