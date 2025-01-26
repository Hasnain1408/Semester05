class PizzaOrderFacade {
    private Account account;
    private Security security;
    private Payment payment;
    private Ledger ledger;
    private Notification notification;

    public PizzaOrderFacade() {
        this.account = new Account();
        this.security = new Security();
        this.payment = new Payment();
        this.ledger = new Ledger();
        this.notification = new Notification();
    }

    public void orderPizza(String cardNumber, String pin, double amount) {
        if (account.checkBalance(amount) && security.verifyPin(pin)) {
            payment.deductAmount(amount);
            ledger.makeEntry(amount);
            notification.sendNotification();
            System.out.println("Pizza order successful!");
        } else {
            System.out.println("Pizza order failed. Please check your details.");
        }
    }
}