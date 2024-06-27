import java.util.ArrayList;

// Tibet Charoensripaiboon 6510450399

public class Player {

    private String name;
    private Board board;
    private Piece piece;
    private ArrayList<Dice> dice;

    public Player(String name) {
        this.name = name;
    }

    public void takeTurn() {
        int totalFV = 0;
        ArrayList<Integer> faceValues = new ArrayList<>(2);

        for (Dice dice : this.dice) {
            dice.roll();
            totalFV += dice.getFaceValue();
            faceValues.add(dice.getFaceValue());
        }

        Square oldLo = getPiece().getLocation();
        Square newLo = getBoard().getSquare(totalFV, oldLo);
        getPiece().setLocation(newLo); // Update piece location

        System.out.printf("Dice is %d,%d%n", faceValues.get(0), faceValues.get(1));

        System.out.printf("Total facevalue = %d%n", totalFV);
        System.out.printf("Now %s", getName());
        System.out.println(" location " + newLo.getName());
    }

    public String getName() {
        return name;
    }

    public Board getBoard() {
        return board;
    }

    public Piece getPiece() {
        return piece;
    }

    public ArrayList<Dice> getDice() {
        return dice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public void setDice(ArrayList<Dice> dice) {
        this.dice = dice;
    }
}
