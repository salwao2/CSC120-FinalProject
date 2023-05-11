import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BandersnatchCage {
    private List<String> inventory;
    private String playerName;

    public BandersnatchCage(List<String> inventoryFromWhiteQueen, String playerName) {
        this.inventory = inventoryFromWhiteQueen;
        this.playerName = playerName;
    }

    public boolean enterCage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You notice the Bandersnatch is blocking the chest with the Vorpal Sword.");
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Ask the Mad Hatter to distract the Bandersnatch with his tricks");
        System.out.println("2. Offer the Bandersnatch something from your inventory");

        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.println("You ask the Mad Hatter to distract the Bandersnatch with his tricks.");
                System.out.println("The Bandersnatch is thoroughly impressed with the Mad Hatter's hat tricks, allowing you to sneak past to the chest.");
                System.out.println("You open the chest and find the Vorpal Sword! Now it's time to defeat the Jabberwocky!");
                inventory.add("Vorpal Sword");
                if (inventory.contains("Vorpal Sword")) {
                    System.out.println("You and your friends make your way to the battlefield...");
                    Battlefield battlefield = new Battlefield(inventory, playerName);
                    battlefield.start();
                    return true;
                }

            case 2:
                if (inventory.isEmpty()) {
                    System.out.println("You don't have anything in your inventory to distract the Bandersnatch.");
                    System.out.println("You need to ask the Mad Hatter to distract the Bandersnatch.");
                    return false;
                } else {
                    
                    System.out.println("Choose what you want to offer the Bandersnatch.");
                    System.out.println("Inventory:");
                    for (int i = 0; i < inventory.size(); i++) {
                        System.out.println((i+1) + ". " + inventory.get(i));
                    }
                    System.out.println("Enter the number of the item you want to use:");
                    int newChoice;
                    try {
                        newChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid choice.");
                        return enterCage();
                    }
                    if (newChoice < 1 || newChoice > inventory.size()) {
                        System.out.println("Invalid choice.");
                        return enterCage();
                    } else {
                        String newItem = inventory.get(newChoice-1);
                        if (newItem.equals("Bandersnatch Eye")) {
                            System.out.println("As you approach the cage, you see the Bandersnatch snarling and snapping at you through the bars. You hold up its eye, and it immediately calms down.");
                            System.out.println("You cautiously enter the cage and drop the eye. You open the chest and grab the Vorpal Sword! Now it's time to defeat the Jabberwocky!. ");
                            inventory.add("Vorpal Sword");
                            if (inventory.contains("Vorpal Sword")) {
                                System.out.println("You have the Vorpal Sword in your inventory! Transitioning to the battlefield...");
                                Battlefield battlefield = new Battlefield(inventory, playerName);
                                battlefield.start();
                                return true;
                            }
                        } else {
                            if (newItem.equals("Chest Key")) {
                                System.out.println("You need the chest key to open the chest. You can't use it to distract the Bandersnatch.");
                                return enterCage();
                            } else {
                                System.out.println("The Bandersnatch is distracted by the " + newItem + ", allowing you to sneak past to the chest.");
                                inventory.remove(newItem);
                                System.out.println("You open the chest and grab the Vorpal Sword! Now it's time to defeat the Jabberwocky!");
                                inventory.add("Vorpal Sword");
                                if (inventory.contains("Vorpal Sword")) {
                                    System.out.println("You and your friends make your way to the battlefield...");
                                    Battlefield battlefield = new Battlefield(inventory, playerName);
                                    battlefield.start();
                                    return true;
                                }
                            }
                        }
                    }
                }

                
            
            default:
                System.out.println("Invalid choice.");
                return enterCage();
                
        }  
    }
}

   
    