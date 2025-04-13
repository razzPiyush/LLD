package SnakeLadder;

public class Main {
    public static void main(String[] args)
    {
        Game game = new Game(16);
        Jump jump1 = new Jump(game.getBoard().getCell(1), game.getBoard().getCell(4));
        Jump jump2 = new Jump(game.getBoard().getCell(14), game.getBoard().getCell(3));
        Jump jump3 = new Jump(game.getBoard().getCell(10), game.getBoard().getCell(14));
        Jump jump4 = new Jump(game.getBoard().getCell(12), game.getBoard().getCell(5));
        // [1 -> 4]
        // [10 -> 14]
        // [14 -> 3]
        // [12 -> 5]
        game.getBoard().addJump(jump1);
        game.getBoard().addJump(jump2);
        game.getBoard().addJump(jump3);
        game.getBoard().addJump(jump4);
        Player player1 = new Player("Alice", game.getBoard().getCell(0));
        Player player2 = new Player("Bob", game.getBoard().getCell(0));
        game.addPlayer(player1);
        game.addPlayer(player2);
        Player winner = game.startGame();
        System.out.println("The winner of game is : " + winner.getName());
    }
}
