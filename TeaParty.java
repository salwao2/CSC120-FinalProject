import java.util.Scanner;

public class TeaParty {
    private MadHatter madHatter;
    private boolean hasMetMadHatter;

    public TeaParty() {
        this.madHatter = new MadHatter();
        this.hasMetMadHatter = false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        
        System.out.println("\nYou arrive at a large table set with tea cups and pastries. The Mad Hatter and the March Hare are having a tea party.");
        System.out.println("Mad Hatter: Ah, welcome to our little tea party! Won't you join us for a cup of tea?");
        
        while (!choice.equals("yes") && !choice.equals("no")) {
            System.out.println("Will you have some tea with us? (yes/no)");
            choice = scanner.nextLine().toLowerCase();
        
            if (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("Mad Hatter: I'm sorry, I didn't understand. Please answer 'yes' or 'no'.");
            }
        }
        
        if (choice.equals("yes")) {
            System.out.println("\nYou sit down at the table and the Mad Hatter pours you a cup of tea.");
            madHatter.greet();
            hasMetMadHatter = true;
        } else {
            System.out.println("Mad Hatter: Oh dear, how rude of us. Is there anything else we can get for you?");
        }
        
        scanner.close();
    }
}