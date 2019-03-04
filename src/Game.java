public class Game {
    private Board board;
    private GameState s;

    public Game() {
        board = new Board();
        s = GameState.RUNNING;

        run();
    }

    private void run() {
        while(s == GameState.RUNNING) {

        }
    }
}
