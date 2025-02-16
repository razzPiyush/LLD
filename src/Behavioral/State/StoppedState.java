package Behavioral.State;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Starting playback.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Cannot pause. The player is stopped.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Already stopped.");
    }
}