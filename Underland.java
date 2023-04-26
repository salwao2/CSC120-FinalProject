
import java.util.Scanner;

public class Underland {
    private WhiteRabbit whiteRabbit;
    private tweedleTwins tweedleTwins;
    private absolemCaterpillar absolem;
    private String playerName;
    
    
    public Underland(String playerName) {
        this.playerName = playerName;
        System.out.println("You crawl through the small door and enter a beautiful garden.");
        this.whiteRabbit = new WhiteRabbit();
        whiteRabbit.greet(playerName);
        this.tweedleTwins = new tweedleTwins("Tweedledum", "Tweedledee");
        tweedleTwins.greet();
        this.absolem = new absolemCaterpillar();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice;
        
        System.out.println("Do you want to follow Tweedle Twins and meet Absolem the Caterpillar? (yes/no)");
        choice = scanner.nextLine().toLowerCase();
        
        while (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
            choice = scanner.nextLine().toLowerCase();
        }
        
        if (choice.equals("yes")) {
            System.out.println("You follow Tweedle Twins and meet Absolem the Caterpillar.");
            absolem.show("calendar");
        } else {
            System.out.println("Tweedle Twins: Alice, you must come with us to see Absolem. You're in danger!");
            
            while (!choice.equals("yes")) {
                System.out.println("Do you want to follow Tweedle Twins and meet Absolem the Caterpillar now? (yes/no)");
                choice = scanner.nextLine().toLowerCase();
                
                while (!choice.equals("yes") && !choice.equals("no")) {
                    System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
                    choice = scanner.nextLine().toLowerCase();
                }
                
                if (choice.equals("yes")) {
                    System.out.println("You follow Tweedle Twins and meet Absolem the Caterpillar.");
                    absolem.show("calendar");
                        // Prompt the player to respond to the message on the calendar
                    System.out.println("Absolem: Will you help us defeat the Jabberwocky on Frabjous Day? (yes/no)");
                    choice = scanner.nextLine().toLowerCase();

                    while (!choice.equals("yes") && !choice.equals("no")) {
                        System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
                        choice = scanner.nextLine().toLowerCase();
                    }

                    if (choice.equals("yes")) {
                        System.out.println("Absolem: Thank you, " + playerName + ". We need your help to save Underland.");
                    } else {
                        System.out.println("Absolem: I see. It is your choice to make. But if you do not help us, Underland will be lost.");
                    }
                } else {
                    System.out.println("Tweedle Twins: Alice, you must come with us to see Absolem. You're in danger!");

                    while (!choice.equals("yes")) {
                        System.out.println("Do you want to follow Tweedle Twins and meet Absolem the Caterpillar now? (yes/no)");
                        choice = scanner.nextLine().toLowerCase();

                        while (!choice.equals("yes") && !choice.equals("no")) {
                            System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
                            choice = scanner.nextLine().toLowerCase();
                        }

                        if (choice.equals("yes")) {
                            System.out.println("You follow Tweedle Twins and meet Absolem the Caterpillar.");
                            absolem.show("calendar");

                            // Prompt the player to respond to the message on the calendar
                            System.out.println("Absolem: Will you help us defeat the Jabberwocky on Frabjous Day? (yes/no)");
                            choice = scanner.nextLine().toLowerCase().trim();


                            while (!choice.equals("yes") && !choice.equals("no")) {
                                System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
                                choice = scanner.nextLine().toLowerCase();
                            }
                            

                            if (choice.equals("yes")) {
                                System.out.println("Absolem: Thank you, " + playerName + ". We need your help to save Underland.");
                            } else {
                                System.out.println("Absolem: Okay. It is your choice to make. But if you do not help us, Underland will be lost.");
                            }
                        } else {
                            System.out.println("Tweedle Twins:" + playerName + ", please come with us. We must keep you safe!");
                        }
                        

        }
    }
    scanner.close();         
            }
        }
    }
}


