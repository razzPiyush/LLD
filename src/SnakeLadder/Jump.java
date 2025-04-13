package SnakeLadder;

public class Jump {
    private Cell startPosition;
    private Cell endPosition;

    public Jump(Cell startPosition, Cell endPosition){
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public Cell getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Cell startPosition) {
        this.startPosition = startPosition;
    }

    public Cell getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Cell endPosition) {
        this.endPosition = endPosition;
    }
}
