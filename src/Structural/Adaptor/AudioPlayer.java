package LLD.Structural.Adaptor;

// Adaptee class (existing class with incompatible interface)
class AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
}