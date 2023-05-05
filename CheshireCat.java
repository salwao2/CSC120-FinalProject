import java.util.Scanner;

public class CheshireCat {
    public String playerName;
    private Scanner scanner;

    public CheshireCat() {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    public void greetPlayer() {
        System.out.println("\nCheshire Cat: Hello " + playerName + ", I am the Cheshire Cat. You seem lost.");
    }

    public void givedirections() {
        System.out.println("\nCheshire Cat: You're looking for the Tea Party, right? Go north, then west.");
        String input = scanner.nextLine().toLowerCase();
        while (!input.equals("north") || !scanner.nextLine().toLowerCase().equals("west")) {
            System.out.println("\nCheshire Cat: You seem lost. Do you want to go back and ask for directions again? (yes/no)");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("yes")) {
                givedirections();
                return;
            }
        }
        System.out.println("\nCheshire Cat: That's the right way. Have a pleasant journey!");
        TeaParty teaParty = new TeaParty();
        teaParty.play();
    }
}