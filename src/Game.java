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
    // 0 - Correct, 1 - Spot taken, 2 - Invalid Range
    private void run() {
        System.out.println("Welcome to TicTacToe! Get ready to play...");
        while(s == GameState.RUNNING) {
            if(board.checkWin()) {
                System.out.println("-----------------------------------");
                System.out.println();
                System.out.println("            WINNER: " + board.currentWinner());
                System.out.println();
                System.out.println("-----------------------------------");
                s = GameState.ENDGAME;
                break;
            }

            int correctInput = 0;
            while(correctInput == 0) {
                System.out.println("Player \"" + board.currentPlayer() + "\", choose your row:");
                int row = scan.nextInt();
                System.out.println("Player \"" + board.currentPlayer() + "\", choose your column:");
                int colm = scan.nextInt();
                if(board.move(row, colm) == 0) {
                    board.printBoard();
                    correctInput = 1;
                } else if (board.move(row, colm) == 1) {
                    System.out.println("-----------------------------------");
                    System.out.println("That spot is already taken, try again!");
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println("-----------------------------------");
                    System.out.println("That is not a correct range (0-2)!");
                    System.out.println("-----------------------------------");
                }
            }
        }
    }
}
