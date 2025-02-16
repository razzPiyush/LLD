package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        MediaPlayerContext player = new MediaPlayerContext();

        player.play();   // Output: Starting playback.
        player.pause();  // Output: Pausing the player.
        player.play();   // Output: Resuming playback.
        player.stop();   // Output: Stopping the player.
    }
}
