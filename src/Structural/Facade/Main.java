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
