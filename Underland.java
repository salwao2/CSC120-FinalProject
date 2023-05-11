import java.util.Scanner;

public class Underland {
    private WhiteRabbit whiteRabbit;
    private tweedleTwins tweedleTwins;
    private absolemCaterpillar absolemCaterpillar;
    //private boolean hasFollowedTweedles;

    public Underland(String playerName) {
        this.whiteRabbit = new WhiteRabbit(playerName);
        this.tweedleTwins = new tweedleTwins("Tweedledum", "Tweedledee");
        this.absolemCaterpillar = new absolemCaterpillar(playerName); // Create an instance of the Absolem class with the playerName
        //this.hasFollowedTweedles = false;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        
        // Call the greet method of the WhiteRabbit class
        whiteRabbit.greet();
        // Call the greet method of the TweedleTwins class
        tweedleTwins.greet();
        
        while (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Do you want to follow Tweedle Twins and the White Rabbit to meet Absolem the Caterpillar? (yes/no)");
            choice = scanner.nextLine().toLowerCase();
        
            if (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
            }
        }
        
        if (choice.equals("yes")) {
            followTweedleTwins();
        } else {
            System.out.println("Tweedle Twins: " + absolemCaterpillar.playerName + ", you must come with us to see Absolem. You're in danger!");
            while (!choice.equals("yes")) {
                System.out.println("Will you come with us to see Absolem the Caterpillar? (yes/no)");
                choice = scanner.nextLine().toLowerCase();
        
                if (!choice.equals("yes") && !choice.equals("no")) {
                    System.out.println("I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
                } else if (choice.equals("no")) {
                    System.out.println("Tweedle Twins: Please reconsider. You're in danger, it's important that you see Absolem.");
                } else {
                    followTweedleTwins();
                }
            }
        }
        scanner.close();
    }
    
    private void followTweedleTwins() {
        System.out.println("\nYou follow Tweedle Twins through the thorny woods to meet Absolem the Caterpillar.");
        tweedleTwins.leadToAbsolem();
        absolemCaterpillar.greet(); // Call the greet method of the Absolem class
        absolemCaterpillar.promptOne(); // Call the promptOne method of the Absolem class
        absolemCaterpillar.show("calendar"); // Call the show method of the Absolem class with the "calendar" argument
        absolemCaterpillar.askSaveUnderland(); // Call the askSaveUnderland method of the Absolem class
    }
}
    