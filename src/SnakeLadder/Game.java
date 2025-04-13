package SnakeLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Deque<Player> playerList;
    private Dice dice;
    private int cellSize;

    public Game(int cellSize){
        this.cellSize = cellSize;
        board = new Board(cellSize);
        playerList = new LinkedList<>();
        dice = new Dice();
    }

    public Board getBoard(){
        return board;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public Player startGame()
    {
        boolean winnerFound = false;
        Player winnerPlayer = null;
        while(!winnerFound) {
            Player player = playerList.getFirst();
            playerList.removeFirst();

            Cell currentCell = player.getCurrentPosition();
            int diceNumber = dice.rollDice();
            int newId = currentCell.getId() + diceNumber;
            if(newId >= cellSize){
                playerList.addLast(player);
                continue;
            }
            if(!board.cellArray[newId].isHasJump()){
                player.setCurrentPosition(board.cellArray[newId]);
            }
            else{
                player.setCurrentPosition(board.getCellAfterJump(board.cellArray[newId]));
            }
            System.out.print("Players turn : " + player.getName() + ", ");
            System.out.print("CurrentPosition : " + currentCell.getId() + ", ");
            System.out.print("Dice role : " + diceNumber + ", ");
            System.out.println("New Position : " + player.getCurrentPosition().getId());
            if(player.getCurrentPosition().getId()==cellSize-1){
                winnerFound = true;
                winnerPlayer = player;
            }
            playerList.addLast(player);
        }
        return winnerPlayer;
    }
}
