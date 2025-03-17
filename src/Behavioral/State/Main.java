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
/*
Definition:
-The State Design Pattern is a behavioral pattern that allows an object to alter its behavior when its internal state changes. The object appears to change its class dynamically by delegating behavior to a corresponding state object.

When to Use:
-When an object needs to change its behavior based on its current state, and these state changes are frequent.
-To replace complex if-else or switch statements for handling different states.
-When you want to encapsulate different states in separate classes for better maintainability.

 */