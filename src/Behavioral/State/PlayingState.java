package Behavioral.State;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Pausing the player.");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping the player.");
        context.setState(new StoppedState());
    }
}