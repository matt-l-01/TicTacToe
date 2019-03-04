public class Board {
    private Box[][] boxes;
    private int id;

    public Board() {
        boxes = new Box[3][3];
        initBoxes();
        id = 0;
    }

    private void initBoxes() {
        for(int i = 0; i < boxes.length; i++) {
            for(int j = 0; j < boxes[i].length; j++) {
                boxes[i][j] = new Box(BoxType.NONE);
            }
        }
    }

    //Error Codes
    // 0 - Correct, 1 - Spot taken, 2 - Invalid Range
    public int move(int r, int c) {
        if(r > 2 || r < 0 || c > 2 || c < 0)
            return 2;

        if(boxes[r][c].getBoxType() != BoxType.NONE) {
            return 1;
        }

        if(id == 0) {
            boxes[r][c] = new Box(BoxType.O);
            id = 1;
            return 0;
        } else {
            boxes[r][c] = new Box(BoxType.X);
            id = 0;
            return 0;
        }
    }

    public String currentPlayer() {
        if(id == 0) {
            return "O";
        }
        return "X";
    }

    //Runs opposite
    public String currentWinner() {
        if(id == 1) {
            return "O";
        }
        return "X";
    }

    public boolean checkWin() {
        if(boxes[0][0].getBoxType() == boxes[0][1].getBoxType() && boxes[0][1].getBoxType() == boxes[0][2].getBoxType() && boxes[0][1].getBoxType() != BoxType.NONE)
            return true;
        if(boxes[1][0].getBoxType() == boxes[1][1].getBoxType() && boxes[1][1].getBoxType() == boxes[1][2].getBoxType() && boxes[1][1].getBoxType() != BoxType.NONE)
            return true;
        if(boxes[2][0].getBoxType() == boxes[2][1].getBoxType() && boxes[2][1].getBoxType() == boxes[2][2].getBoxType() && boxes[2][1].getBoxType() != BoxType.NONE)
            return true;

        if(boxes[0][0].getBoxType() == boxes[1][0].getBoxType() && boxes[1][0].getBoxType() == boxes[2][0].getBoxType() && boxes[1][0].getBoxType() != BoxType.NONE)
            return true;
        if(boxes[0][1].getBoxType() == boxes[1][1].getBoxType() && boxes[1][1].getBoxType() == boxes[2][1].getBoxType() && boxes[1][1].getBoxType() != BoxType.NONE)
            return true;
        if(boxes[0][2].getBoxType() == boxes[1][2].getBoxType() && boxes[1][2].getBoxType() == boxes[2][2].getBoxType() && boxes[1][2].getBoxType() != BoxType.NONE)
            return true;

        if(boxes[0][0].getBoxType() == boxes[1][1].getBoxType() && boxes[1][1].getBoxType() == boxes[2][2].getBoxType() && boxes[1][1].getBoxType() != BoxType.NONE)
            return true;
        if(boxes[0][2].getBoxType() == boxes[1][1].getBoxType() && boxes[1][1].getBoxType() == boxes[2][0].getBoxType() && boxes[1][1].getBoxType() != BoxType.NONE)
            return true;

        return false;
    }

    @SuppressWarnings("Duplicates")
    public void printBoard() {
        System.out.println("-------------");
        System.out.println("| " + boxes[0][0].getBoxType().toString() + " | " + boxes[0][1].getBoxType().toString() + " | " + boxes[0][2].getBoxType().toString() + " |");
        System.out.println("-------------");
        System.out.println("| " + boxes[1][0].getBoxType().toString() + " | " + boxes[1][1].getBoxType().toString() + " | " + boxes[1][2].getBoxType().toString() + " |");
        System.out.println("-------------");
        System.out.println("| " + boxes[2][0].getBoxType().toString() + " | " + boxes[2][1].getBoxType().toString() + " | " + boxes[2][2].getBoxType().toString() + " |");
        System.out.println("-------------");
    }
}