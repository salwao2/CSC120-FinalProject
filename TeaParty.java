import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeaParty {
    private MadHatter madHatter;
    //private boolean hasMetMadHatter;
    private List<String> inventory;
    private List<String> tableObjects; // list of objects on the table
    private String playerName;

    public TeaParty(String playerName) {
        this.madHatter = new MadHatter();
        //this.hasMetMadHatter = false;
        this.playerName = playerName;
        this.inventory = new ArrayList<>();
        this.tableObjects = new ArrayList<>();
        tableObjects.add("teaspoon");
        tableObjects.add("cupcake");
        tableObjects.add("sugar cube");
        tableObjects.add("flowers");
    }

    // method to examine the table and show the objects
    public void examine() {
        System.out.println("You examine the table and see:");
        for (String object : tableObjects) {
            System.out.println("- " + object);
        }
    }

    // method to grab an object from the table
    public void grab(String item) {
        if (tableObjects.contains(item)) {
            System.out.println("You grab the " + item + ".");
            tableObjects.remove(item);
            inventory.add(item);
        } else {
            System.out.println("There is no " + item + " on the table.");
        }
    }

    // method to show the current inventory
    public void show() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
        } else {
            System.out.println("You have the following items in your inventory:");
            for (String item : inventory) {
                System.out.println("- " + item);
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
    
        System.out.println("\nYou arrive at a large table set with tea cups and pastries. The Mad Hatter and the Dormouse are having a tea party.");
        madHatter.greet();
    
        while (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Dormouse: Won't you join us for a cup of tea? (yes/no)");
            choice = scanner.nextLine().toLowerCase();
    
            if (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Mad Hatter: I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
            }
        }
    
        if (choice.equals("yes")) {
            System.out.println("\nYou sit down at the table and the Mad Hatter pours you a cup of tea.");
            //hasMetMadHatter = true;
    
            System.out.println("\nMad Hatter: Feel free to grab anything else you'd like.");
            while (true) {
                System.out.println("What would you like to do? (examine/grab/continue)");
                choice = scanner.nextLine().toLowerCase();
                if (choice.equals("examine")) {
                    examine();
                } else if (choice.equals("grab")) {
                    System.out.println("What would you like to grab?");
                    String item = scanner.nextLine().toLowerCase();
                    grab(item);
                } else if (choice.equals("continue")) {
                    break;
                } else {
                    System.out.println("Mad Hatter: I'm sorry, I didn't understand.");
                }
            }

            madHatter.WhiteQueen();
            madHatter.askForQuestions(scanner);
    
        } else {
            System.out.println("Mad Hatter: No worries, help yourself to anything on the table.");
            //hasMetMadHatter = true;
    
            System.out.println("\nMad Hatter: Feel free to grab anything you'd like.");
            while (true) {
                System.out.println("What would you like to do? (examine/grab/continue)");
                choice = scanner.nextLine().toLowerCase();
                if (choice.equals("examine")) {
                    examine();
                } else if (choice.equals("grab")) {
                    System.out.println("What would you like to grab?");
                    String item = scanner.nextLine().toLowerCase();
                    grab(item);
                } else if (choice.equals("continue")) {
                    break;
                } else {
                    System.out.println("Mad Hatter: I'm sorry, I didn't understand.");
                }
            }

            madHatter.askForQuestions(scanner);
        }    
        
        System.out.println("You hear a faint sound of rumbling in the distance...");
        
        System.out.println("Mad Hatter: Oh no, the Red Queen's Army is here to take you! If you want to save Underland, I can safely get you to the White Queen's castle if you trust me.");
        
        while (!choice.equals("1") && !choice.equals("2")) {
            System.out.println("1. I trust you\n2. I just met you, I can't trust you.");
            choice = scanner.nextLine().toLowerCase();
        
            if (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Mad Hatter: I'm sorry, I didn't understand. Please enter '1' or '2'.");
            }
        }
        
        if (choice.equals("1")) {
            System.out.println("Mad Hatter: Excellent! Quick, hop into my hat!");
            System.out.println("You jump into the Mad Hatter's hat and feel yourself shrinking as he places the hat onto his head.");
            System.out.println("Mad Hatter: Hold on tight, we're going down the river!");
            WhiteQueen whiteQueen = new WhiteQueen(inventory, playerName);
            whiteQueen.play();
        } else {
            System.out.println("Mad Hatter: I understand. Unfortunately, we don't have much time. The Red Queen's army is here.");
            System.out.println("As the Red Queen's army approaches, you and the Mad Hatter are taken captive and brought to the Red Queen's castle.");
            RedQueenCastle redQueenCastle = new RedQueenCastle(inventory, playerName);
            redQueenCastle.throwIntoCell();
            redQueenCastle.discussEscapePlan(playerName);

        }
        scanner.close();
    }
}
    