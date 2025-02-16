package Behavioral.State;

public class PausedState implements State {
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Resuming playback.");
        context.setState(new PlayingState());
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping the player from paused state.");
        context.setState(new StoppedState());
    }
}