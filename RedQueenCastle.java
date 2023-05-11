import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RedQueenCastle {
    private List<String> inventory;
    private String playerName;

    public RedQueenCastle(List<String> inventory, String playerName) {
        this.inventory = inventory;
        this.playerName = playerName;
    }

    public void throwIntoCell() {
        System.out.println("\nGuard: You two stay put until the Red Queen decides when to behead you.");
    }

    public void discussEscapePlan(String playerName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mad Hatter: What are we going to do " + playerName + ". We are doomed! If only we had something that can help us escape.");
    
        if (inventory.isEmpty()) {
            System.out.println("\nUnfortunately, you don't have any items in your inventory.");
            System.out.println("\nYou and the Mad Hatter have no way to escape and are taken by the guards and beheaded by the Queen. GAME OVER.");
            scanner.close();
            return;
        }
    
        System.out.println("\nWhich item from your inventory do you want to use to escape? (choose the associated number of the object)");
    
        int i = 1;
        for (String item : inventory) {
            System.out.println(i + ". " + item);
            i++;
        }
    
        int choice = -1;
        while (choice < 1 || choice > inventory.size()) {
            System.out.print("\nEnter the number of the item you want to use: ");
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume the invalid input
            }
            if (choice < 1 || choice > inventory.size()) {
                System.out.println("Invalid input. Please enter a number between 1 and " + inventory.size() + ".");
            }
        }
    
        String selectedItem = inventory.get(choice - 1);
        switch (selectedItem) {
            case "teaspoon":
                System.out.println("You use the teaspoon to pick the lock and unlock the door.");
                System.out.println("You and the Mad Hatter escape the cell!");
                findTweedleTwins();
                break;
    
            case "cupcake":
            case "sugar cube":
                System.out.println("You eat the " + (selectedItem.equals("cupcake") ? "cupcake" : "sugar cube") + " and shrink.");
                System.out.println("You and the Mad Hatter escape the cell through the crack under the door.");
                findTweedleTwins();
    
                break;
            case "flowers":
                System.out.println("You use the flowers to trick the guard into smelling them.");
                System.out.println("Guard: *snores*");
                System.out.println("You take the guard's keys and use them to unlock the door.");
                System.out.println("You and the Mad Hatter escape the cell!");
                findTweedleTwins();
    
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and " + inventory.size() + ".");
                break;
        }
    
        scanner.close(); // close the scanner
    }    
         

    private void findTweedleTwins() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYou and the Mad Hatter are outside the cell. What do you want to do next?");
        System.out.println("1. Find the Tweedle Twins to save them.");
        System.out.println("2. Escape the Red Queen's Castle.");
    
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
    
        if (choice == 1) {
            System.out.println("You decide to find the Tweedle Twins to save them. You navigate through the castle and eventually find their cell.");
    
            System.out.println("\nTweedle Dee: Thank you for saving us! You must be here to stop the Red Queen.");
    
            System.out.println("Tweedle Dum: If you want to defeat the Red Queen, you must get the Vorpal Sword from the Bandersnatch Beast's cage. But be careful, the Bandersnatch is a fierce creature.");
    
            System.out.println("Tweedle Dee: Here, take this. It's the Bandersnatch's eye that we plucked earlier. Use it as a peace offering in exchange for the Vorpal Sword.");
            inventory.add("Bandersnatch Eye");

            System.out.println("\nYou now have a choice. What do you want to do?");
            System.out.println("1. I'll go to the Bandersnatch Beast's cage to get the Vorpal Sword.");
            System.out.println("2. Count me out. I'm not risking my life to get a sword. I'm returning home.");
    
            int choice2 = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
    
            if (choice2 == 1) {
                BandersnatchCage cage = new BandersnatchCage(inventory, playerName);
                cage.enterCage();
    
                // continue the game with the battle
            } else if (choice2 == 2) {
                System.out.println("You escape the Red Queen's Garden and use the key to return back to the rabbit hole and return home. Unfortunately, you did not save Underland.");
                System.out.println("GAME OVER");
            }
        } else if (choice == 2) {
            System.out.println("Mad Hatter: We can't just leave yet. We need to find the Tweedle Twins first.");
    
            System.out.println("You have a choice:");
            System.out.println("1. Find the Tweedle Twins to save them.");
            System.out.println("2. Leave the twins behind and escape the Red Queen's Castle to return back home.");
    
            int choice2 = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
    
            if (choice2 == 1) {
                System.out.println("You decide to find the Tweedle Twins to save them. You navigate through the castle and eventually find their cell.");
    
                System.out.println("\nTweedle Dee: Thank you for saving us! You must be here to stop the Red Queen.");
    
                System.out.println("Tweedle Dum: If you want to defeat the Red Queen, you must get the Vorpal Sword from the Bandersnatch Beast's cage. But be careful, the Bandersnatch is a fierce creature.");
        
                System.out.println("Tweedle Dee: Here, take this. It's the Bandersnatch's eye that we plucked earlier. Use it as a peace offering in exchange for the Vorpal Sword.");
                inventory.add("Bandersnatch Eye");
        
                System.out.println("\nYou now have a choice. What do you want to do?");
                System.out.println("1. I'll go to the Bandersnatch Beast's cage to get the Vorpal Sword.");
                System.out.println("2. Count me out. I'm not risking my life to get a sword. I'm returning home.");

                int choice3 = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
    
            if (choice3 == 1) {
                BandersnatchCage cage = new BandersnatchCage(inventory, playerName);
                cage.enterCage();
    
            } else if (choice3 == 2) {
                System.out.println("You escape the Red Queen's Garden and use the key to return back to the rabbit hole and return home. Unfortunately, you did not save Underland.");
                System.out.println("GAME OVER");
            }

            } else if (choice2 == 2) {
                System.out.println("You escape the Red Queen's Garden and use the key to return back to the rabbit hole and return home. Unfortunately, you did not save Underland.");
                System.out.println("GAME OVER");
            }
        }
        scanner.close(); // close the scanner
        
    }
    
}
    
    