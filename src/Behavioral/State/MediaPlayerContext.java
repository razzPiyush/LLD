package Behavioral.State;

public class MediaPlayerContext {
    private State currentState;

    public MediaPlayerContext() {
        currentState = new StoppedState(); // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void play() {
        currentState.play(this);
    }

    public void pause() {
        currentState.pause(this);
    }

    public void stop() {
        currentState.stop(this);
    }
}
