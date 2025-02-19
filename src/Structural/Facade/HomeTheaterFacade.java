package Structural.Facade;

// Facade Class
public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Projector projector;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(Amplifier amplifier, Projector projector, DVDPlayer dvdPlayer) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.turnOn();
        amplifier.setVolume(5);
        projector.turnOn();
        projector.setInput("DVD");
        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
        System.out.println("Enjoy your movie!");
    }
}