package Behavioral.Observer;

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
/*
Definition:
-The Observer Design Pattern is a behavioral pattern in which one object (the Subject) maintains a list of its
dependents (the Observers) and notifies them of any state changes, typically by calling their update methods.

When to Use:
-When multiple objects need to be notified automatically whenever the state of one object changes.
-When an event occurs, and multiple objects need to react to that event.
-When you want to decouple objects that produce data/events (Subjects) from objects that consume them (Observers).
 */