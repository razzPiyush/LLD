package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        DVDPlayer dvdPlayer = new DVDPlayer();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, projector, dvdPlayer);
        homeTheater.watchMovie("Inception");
    }
}

/*
Facade Design Pattern
Definition:
The Facade design pattern is a structural pattern that provides a simplified interface to a larger body of code,
such as a complex subsystem. It hides the complexities of the subsystem and provides a unified interface for the
client.

When to Use:
-When you want to provide a simple interface to a complex subsystem.
-When you want to reduce dependencies between clients and a subsystem by introducing an intermediary.
-When you need to layer your system (e.g., presentation layer -> business layer -> data access layer).
 */
