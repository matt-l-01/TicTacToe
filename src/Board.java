public class Board {
    private Box[][] boxes;
    private int id;

    public Board() {
        boxes = new Box[3][3];
        id = 0;
    }

    //0 = O
    //1 = X
    public int move(int r, int c) {
        if(r > 2 || r < 0 || c > 2 || c < 0)
            return 2;

        if(id == 0) {
            if(boxes[r][c] == null) {
                boxes[r][c] = new Box(BoxType.O);
                return 0;
            }

            id = 1;
            return 1;
        } else {
            if(boxes[r][c] == null) {
                boxes[r][c] = new Box(BoxType.X);
                return 0;
            }

            id = 0;
            return 1;
        }
    }
}