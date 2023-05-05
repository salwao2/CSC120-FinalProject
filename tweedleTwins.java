import java.util.Scanner;

public class tweedleTwins {

    private String name1;
    private String name2;


    public tweedleTwins(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;

    }

    public void greet() {
        System.out.println("\nHi! We are the Tweedle twins. I am " + name1 + " and he's " + name2 + ".");
        System.out.println("\nPlease, follow us to visit Absolem, he's been waiting for you.");
    }

    public void leadToAbsolem() {
        System.out.println("\nAs you're walking through the woods it starts to get foggy and you can't see.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat do you want to do?\n1. Ask the twins if they're sure this is the right way\n2. Trust the twins and keep following behind them");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("\nYou ask the twins if they're sure this is the right way.");
            System.out.println("\nTweedle twins: Yes, he's right up here beyond the fog");
        }
        else if (choice == 2) {
            System.out.println("\nYou decide to trust the twins and keep following behind them.");
        }
        else {
            System.out.println("\nInvalid choice. Please enter either 1 or 2.");
            return;
        }
        System.out.println("\nBeyond the fog, you see Absolem the caterpillar blowing smoke out of a hookah.");
    }
    
}

    

