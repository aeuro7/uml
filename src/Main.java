import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        System.out.print("Enter number of players : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter number of round : ");
        int round = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }

        scanner.close();

        Mgame mGame = new Mgame(round, players);
        mGame.startGame();
    }
}
