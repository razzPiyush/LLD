package SnakeLadder;

public class Player {
    private String name;
    private Cell currentPosition;

    public Player(String name, Cell cell){
        this.name = name;
        this.currentPosition = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cell getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Cell currentPosition) {
        this.currentPosition = currentPosition;
    }
}
