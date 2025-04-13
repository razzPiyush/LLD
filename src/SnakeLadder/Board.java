package SnakeLadder;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public Cell[] cellArray;
    public List<Jump> jumpList;

    public Board(int cellSize){
        cellArray = new Cell[cellSize];
        for(int i=0; i<cellSize; i++){
            cellArray[i] = new Cell(i, i/cellSize, i%cellSize);
        }
        jumpList = new ArrayList<>();
    }

    public Cell getCell(int id){
        return  cellArray[id];
    }

    public void addJump(Jump jump){
        jumpList.add(jump);
        cellArray[jump.getStartPosition().getId()].setHasJump(true);
    }

    public Cell getCellAfterJump(Cell cell){
        for(Jump jump : jumpList){
            if(jump.getStartPosition()==cell){
                return jump.getEndPosition();
            }
        }
        return null;
    }

}
