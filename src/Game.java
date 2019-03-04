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
            System.out.println("Welcome to TicTacToe! Get ready to play...");
            System.out.println("Player O, choose your ");
        }
    }

    private void move(int r, int c) {
        board.move(r, c);
    }
}
