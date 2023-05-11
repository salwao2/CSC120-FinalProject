import java.util.List;
import java.util.Scanner;

public class Battlefield {
    private List<String> inventory;
    private String playerName;

    public Battlefield(List<String> inventory, String playerName) {
        this.inventory = inventory;
        this.playerName = playerName;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFrabjous Day has arrived. The Red Army approaches.");
        System.out.println("You spot the Jabberwocky among the Red Army.");
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Lead the Jabberwocky away from the White Army");
        System.out.println("2. Let the Jabberwocky come to you first");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            leadJabberwockyAway();
        } else if (choice == 2) {
            System.out.println("The Jabberwocky crushes the White Queen's soldiers on its way to find you. You need to stop it before it kills any more soldiers!");
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Use all your force to attack the Jabberwocky");
            System.out.println("2. Attempt to trick the Jabberwocky with an item from your inventory");

            int choice2 = scanner.nextInt();
            scanner.nextLine();

            if (choice2 == 1) {
                System.out.println("You charge at the Jabberwocky and strike it with the Vorpal Sword.");
                System.out.println("The Jabberwocky falls to the ground, defeated.");
                System.out.println("Congratulations " + playerName + ", you have saved Underland!");
            } else if (choice2 == 2) {
                if (inventory.isEmpty()) {
                    System.out.println("You have no items in your inventory to use.");
                    System.out.println("The Jabberwocky attacks you and you are unable to defend yourself.");
                    System.out.println("You have failed to save Underland. The Red Queen's army defeats the White Queen's. END GAME");
                } else {
                    boolean itemChosen = false;
                    while (!itemChosen) {
                        System.out.println("Inventory:");
                        for (int i = 0; i < inventory.size(); i++) {
                            System.out.println((i+1) + ". " + inventory.get(i));
                        }
                        System.out.println("Enter the number of the item you want to use:");
                        int itemChoice = scanner.nextInt();
                        scanner.nextLine();
                        if (itemChoice < 1 || itemChoice > inventory.size()) {
                            System.out.println("Invalid choice.");
                        } else {
                            String item = inventory.get(itemChoice-1);
                            if (item.equalsIgnoreCase("Vorpal Sword")) {
                                System.out.println("You can't use the Vorpal Sword since you need it to slay the Jabberwocky. Choose a different item.");
                            } else {
                                System.out.println("You throw the " + item + " to distract the Jabberwocky.");
                                System.out.println("The Jabberwocky chases after the " + item + ", giving you the opportunity to strike it with the Vorpal Sword.");
                                System.out.println("The Jabberwocky falls to the ground, defeated.");
                                System.out.println("Congratulations " + playerName + ", you have saved Underland!");
                                itemChosen = true;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Invalid choice.");
                start();
            }
        } else {

            System.out.println("Invalid choice.");
            start();
        }
       
        scanner.close(); // close the scanner
    }

    public void leadJabberwockyAway() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You lead the Jabberwocky up the ruins of a castle.");
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Trick the Jabberwocky by throwing an item from your inventory off the castle");
        System.out.println("2. Jump on the Jabberwocky's back and ride it away from the battlefield");
        int choice3 = scanner.nextInt();
        scanner.nextLine();
        switch (choice3) {
            case 1:
                if (inventory.isEmpty()) {
                    System.out.println("You don't have anything in your inventory to throw.");
                    System.out.println("The Jabberwocky sees through your bluff and attacks you.");
                    System.out.println("You failed to save Underland. GAME OVER.");
                } else {
                    System.out.println("You have the following items in your inventory:");
                    int itemNum = 1;
                    for (String item : inventory) {
                        System.out.println(itemNum + ". " + item);
                        itemNum++;
                    }
                    int thrownItemNum;
                    do {
                        System.out.println("Enter the number of the item you would like to throw:");
                        thrownItemNum = scanner.nextInt();
                        scanner.nextLine();
                        if (thrownItemNum < 1 || thrownItemNum > inventory.size()) {
                            System.out.println("Invalid item number.");
                            thrownItemNum = 0;
                        }
                        else if (inventory.toArray()[thrownItemNum - 1].equals("Vorpal Sword")) {
                            System.out.println("You can't use the Vorpal Sword since you need it to slay the Jabberwocky. Try something else.");
                            thrownItemNum = 0;
                        }
                    } while (thrownItemNum == 0);
                    String thrownItem = (String) inventory.toArray()[thrownItemNum - 1];
                    inventory.remove(thrownItem);
                    System.out.println("You throw " + thrownItem + " off the castle, distracting the Jabberwocky.");
                    System.out.println("The Jabberwocky chases after the " + thrownItem + ", giving you the opportunity to strike it with the Vorpal Sword.");
                    System.out.println("The Jabberwocky falls to the ground, defeated.");
                    System.out.println("Congratulations " + playerName + ", you have saved Underland!");
                }
                break;
            case 2:
                System.out.println("You jump on the Jabberwocky's back and ride it away from the battlefield.");
                System.out.println("The Jabberwocky takes you far away from the battle and then throws you off its back.");
                System.out.println("You are severely injured and unable to return to the battlefield to help the White Queen.");
                System.out.println("Game over.");
                break;
            default:
                System.out.println("Invalid choice.");
                leadJabberwockyAway();
                break;
        }
        scanner.close(); // close the scanner
    }
}    