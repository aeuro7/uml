import java.util.ArrayList;
import java.util.Arrays;

public class Mgame {
    private int roundCount;
    private int round;
    private ArrayList<Player> players;
    private Board board;
    private ArrayList<Dice> dies;

    public Mgame(int round, ArrayList<Player> players) {
        this.round = round;
        this.roundCount = 0;
        this.players = players;
        this.board = createBoard();
        this.dies = new ArrayList<>(Arrays.asList(new Dice(), new Dice()));
    }

    private Board createBoard() {
        ArrayList<Square> squares = new ArrayList<>();
        int pad = 40;
        for (int i = 0; i < pad; i++) {
            squares.add(new Square("Square " + i));
        }
        return new Board(squares);
    }

    public void startGame() {
        for (Player player : players) {
            if (player.getPiece() == null) {
                Piece piece = new Piece(board.getSquares().get(0));
                player.setPiece(piece);
            }
            player.setBoard(board);
            player.setDice(dies);
        }

        for (; roundCount < round; roundCount++) {
            playRound();
        }
        System.out.println("---------endgame-----------");

    }

    public void playRound() {
        for (Player player : players) {
            System.out.println("---------------------------");
            System.out.printf("** ");
            System.out.printf(player.getName()+" Round %d **%n",roundCount+1);
            player.takeTurn();

        }
    }
}
