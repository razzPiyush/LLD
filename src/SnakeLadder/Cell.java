package SnakeLadder;

public class Cell {
    private int id;
    private int row;
    private int column;
    boolean hasJump;

    public Cell(int id, int row, int column){
        this.id = id;
        this.row = row;
        this.column = column;
        this.hasJump = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isHasJump(){
        return hasJump;
    }

    public void setHasJump(boolean hasJump){
        this.hasJump = hasJump;
    }
}
