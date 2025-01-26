public class Main {
    public static void main(String[] args) {
        PizzaOrderFacade facade = new PizzaOrderFacade();
        facade.orderPizza("1234-5678-9012-3456", "1234", 25.99);
    }
}