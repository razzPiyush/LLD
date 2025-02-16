package LLD.Behavioral.Observer;

// Usage
public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel1 = new NewsChannel("Channel 1");
        NewsChannel newsChannel2 = new NewsChannel("Channel 2");

        newsAgency.registerObserver(newsChannel1);
        newsAgency.registerObserver(newsChannel2);

        newsAgency.setNews("Breaking news: Observer Pattern explained!");

        // Removing an observer
        newsAgency.removeObserver(newsChannel1);

        newsAgency.setNews("More breaking news: Observer Pattern in action!");
    }
}
