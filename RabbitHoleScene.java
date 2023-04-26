import java.util.Scanner;

public class RabbitHoleScene {
    private String playerName;
    private Scanner scanner;

    public RabbitHoleScene(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("You follow the white rabbit and fall down the rabbit hole....");
        System.out.println("You land in a room with a small door and a key on the table. There is also a bottle with a label that says 'Drink Me' and a cake with a note that says 'Eat Me'. \n");
        while (true) {
            System.out.println("Please choose your next action:");
            System.out.println("1. Drink from the bottle");
            System.out.println("2. Eat the cake");
            System.out.println("3. Try the small door");
            System.out.println("4. Grab the key to open the door");
    
            int choice = scanner.nextInt();
    
            switch (choice) {
                case 1:
                    System.out.println("You drink from the bottle and suddenly you start to shrink!");
                    System.out.println("You shrink so small that you can fit through the small door.\n"); // the door is locked. if tries case 4: too small to reach the key on the table. case 2 --> case 4 --> case 1
                    Underland underland1 = new Underland(playerName);
                    underland1.start();
                    return;
                case 2:
                    System.out.println("You eat the cake and suddenly you start to grow!");
                    System.out.println("You grow so big that you can no longer fit through the door.");
                    System.out.println("You must find another way out.");
                    break;
                case 3:
                    System.out.println("You try the small door, but you are too big to fit through it.");
                    System.out.println("You must find another way out.");
                    break;
                case 4: // grab key from table and puts it in pocket
                    System.out.println("You use the key to open the door and enter a beautiful garden.\n"); // you unlocked the door, but you are still too big to fit. You must find a way to fit through the door. case 1 --> case 4
                    Underland underland2 = new Underland(playerName);
                    underland2.start();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
                
            }
            
        }
    }
}

    