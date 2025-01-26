import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println("Subscriber added.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
        System.out.println("Subscriber removed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    // Method to publish news
    public void publishNews(String news) {
        System.out.println("News Published: " + news);
        this.latestNews = news;
        notifyObservers();
    }
}
