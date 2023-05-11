import java.util.Scanner;

public class CheshireCat {
    public String playerName;
    private Scanner scanner;

    public CheshireCat(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    public void greetPlayer() {
        System.out.println("\nCheshire Cat: Hello " + playerName + ", I am the Cheshire Cat. You seem lost.");
    }

    public void givedirections() {
        System.out.println("\nCheshire Cat: You're looking for the Tea Party, right? Go north, then west (enter 'north' first and then 'west').");
        String input1 = scanner.nextLine().toLowerCase();
        String input2 = scanner.nextLine().toLowerCase();
        while (!(input1.equals("north") && input2.equals("west"))) {
            System.out.println("\nCheshire Cat: You seem lost. Do you need help with directions? (yes/no)");
            String help = scanner.nextLine().toLowerCase();
            if (help.equals("no")) {
                System.out.println("\nCheshire Cat: Okay, try again.");
                input1 = scanner.nextLine().toLowerCase();
                input2 = scanner.nextLine().toLowerCase();
            } else if (help.equals("yes")) {
                System.out.println("\nCheshire Cat: You're looking for the Tea Party, right? Go north, then west (enter 'north' first and then 'west').");
                input1 = scanner.nextLine().toLowerCase();
                input2 = scanner.nextLine().toLowerCase();
            } else {
                System.out.println("\nCheshire Cat: I didn't understand that. Do you need help with directions? (yes/no)");
            }
        }
        System.out.println("\nCheshire Cat: That's the right way. Have a pleasant journey!");
        TeaParty teaParty = new TeaParty(playerName);
        teaParty.play();
    }
}    