import java.util.Scanner;

public class Game {
    private Board board;
    private GameState s;
    private Scanner scan;

    public Game() {
        board = new Board();
        s = GameState.RUNNING;
        scan = new Scanner(System.in);

        run();
    }

    private void run() {
        while(s == GameState.RUNNING) {
            board.printBoard();
            System.out.println("Welcome to TicTacToe! Get ready to play...");
            System.out.println("Player " + board.currentPlayer() + ", choose your row:");
            int row = scan.nextInt();
            System.out.println("Player " + board.currentPlayer() + ", choose your column:");
            int colm = scan.nextInt();
            if(board.move(row, colm) == 0) {
                //print box
            } else if (board.move(row, colm) == 1) {

            } else {

            }
        }
    }
}
