package LLD.Structural.Adaptor;

// Usage
public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayerAdapter(new AudioPlayer());
        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("wav", "song.wav"); // Invalid type
    }
}