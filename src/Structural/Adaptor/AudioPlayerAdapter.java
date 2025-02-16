package LLD.Structural.Adaptor;

// Adapter class (adapting the AudioPlayer to the MediaPlayer interface)
class AudioPlayerAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer;

    public AudioPlayerAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            audioPlayer.playAudio(fileName);  // Delegating the call
        } else {
            System.out.println("Invalid audio type: " + audioType);
        }
    }
}