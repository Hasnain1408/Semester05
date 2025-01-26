// Client Code
public class Main {
    public static void main(String[] args) {
        // Create a news agency (Subject)
        NewsAgency newsAgency = new NewsAgency();

        // Create subscribers (Observers)
        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        // Subscribe users to the news agency
        newsAgency.subscribe(alice);
        newsAgency.subscribe(bob);

        // Publish a news update
        newsAgency.publishNews("Breaking News: Design Patterns are awesome!");

        // Unsubscribe one user and publish another update
        newsAgency.unsubscribe(bob);
        newsAgency.publishNews("Update: Observer Pattern Explained!");
    }
}
