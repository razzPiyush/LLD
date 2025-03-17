package Structural.Adaptor;

// Usage
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayerAdapter(new AudioPlayer());
        mediaPlayer.play("mp3", "song.mp3"); // in media player we are playing audio
        mediaPlayer.play("wav", "song.wav"); // Invalid type
    }
}
/*
Definition:
The Adapter design pattern is a structural pattern that acts as a bridge between two incompatible interfaces.
It allows objects with incompatible interfaces to work together by converting one interface into another expected by
the client.

When to Use:
-When you want to use an existing class but its interface does not match the one you need.
-When you need to integrate a legacy class into a new system.
-When you have multiple classes with similar functionalities but different interfaces, and you want to standardize their
usage.
 */