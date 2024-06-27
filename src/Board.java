import java.util.ArrayList;

public class Board {

    private ArrayList<Square> squares;

    public Board(ArrayList<Square> square) {
        this.squares = square;
    }

    public Square getSquare(int i, Square old) {
        Square newLo = null;
        for (int j = 0; j < squares.size(); j++) {
            if (old.equals(squares.get(j))) {
                newLo = squares.get((j + i) % squares.size());
                break;
            }
        }
        return newLo;}

        public ArrayList<Square> getSquares() {
            return squares;
        }
}
