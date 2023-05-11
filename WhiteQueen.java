import java.util.List;
import java.util.Scanner;

public class WhiteQueen {
    private List<String> inventory;
    private String playerName;

    public WhiteQueen(List<String> inventoryFromTeaParty, String playerName) {
        this.inventory = inventoryFromTeaParty;
        this.playerName = playerName;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("\nAs you approach the White Queen's castle, you see the queen standing at the dock, waving.");
            System.out.println("White Queen: Welcome, welcome! I am so glad you two made it. I've been so eager to meet you, " + playerName + ".");
            System.out.println("She leads you inside the castle and offers you tea and cake.");

            System.out.println("\nYou notice that the cake and tea are labeled \"Eat me\" and \"Drink me\" respectively. Which one would you like to choose?");
            System.out.println("1. Eat the cake");
            System.out.println("2. Drink the tea");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                System.out.println("\nYou eat the cake and grow back to your normal size.");
            } else if (choice == 2) {
                System.out.println("\nYou drink the tea and grow back to your normal size.");
            } else {
                System.out.println("\nInvalid choice. Please try again.");
                play();
                return;
            }

            System.out.println("\nWhite Queen: Now you are fit to fight the Jabberwocky. However, you need one last thing, the Vorpal Sword. You will find it in the Red Queen's Castle in the chest with the Bandersnatch Beast. Here is the key for the chest.");
            System.out.println("Do you want to take the key? (yes/no)");
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                inventory.add("Chest Key");
                System.out.println("\nThe White Queen hands you the key and says, \"I thank you for your bravery. Please be safe.\"");
            } else {
                System.out.println("\nWhite Queen: Please, " + playerName + ", you must take the key. It's the only way to save Underland.");
                inventory.add("Chest Key");
                System.out.println("The White Queen hands you the key and says, \"I thank you for your bravery. Please be safe.\"");
            }

            System.out.println("\nYou and the Mad Hatter arrive at the Red Queen's Castle and sneak to the Bandersnatch's cage.");
            BandersnatchCage cage = new BandersnatchCage(inventory, playerName);
            cage.enterCage();
        } finally {
            scanner.close();
        }
    }
}



    