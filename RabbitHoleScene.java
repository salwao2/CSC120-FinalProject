import java.util.Scanner;

public class RabbitHoleScene {
    private String playerName;
    private Scanner scanner;
    private boolean hasKey;

    public RabbitHoleScene(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
        this.hasKey = false;
    }

    public void start() {
        System.out.println("You follow the white rabbit and fall down the rabbit hole....");
        System.out.println("You land in a room with a small door and a key on the table. There is also a bottle with a label that says 'Drink Me' and a cake with a note that says 'Eat Me'. \n");
        while (true) {
            System.out.println("Please choose your next action by typing the number:");
            System.out.println("1. Drink from the bottle");
            System.out.println("2. Eat the cake");
            System.out.println("3. Try the small door");
            System.out.println("4. Grab the key to open the door");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (hasKey) {
                        System.out.println("You drink from the bottle and suddenly you start to shrink!");
                        System.out.println("You shrink so small that you can fit through the small door.\n");
                        Underland underland1 = new Underland(playerName);
                        underland1.start();
                        return;
                    } else {
                        System.out.println("You can't drink from the bottle yet. You need to grab the key first.");
                        break;
                    }
                case 2:
                    System.out.println("You eat the cake and suddenly you start to grow!");
                    System.out.println("You grow so big that you can no longer fit through the door.");
                    System.out.println("You must find another way out.");
                    break;
                case 3:
                    if (hasKey) {
                        System.out.println("You try the small door, but you are too big to fit through it.");
                        System.out.println("You must find another way out.");
                        break;
                    } else {
                        System.out.println("The door is locked. You need to grab the key first.");
                        break;
                    }
                case 4:
                    if (hasKey) {
                        System.out.println("You've already grabbed the key.");
                        break;
                    } else {
                        System.out.println("You grab the key from the table and put it in your pocket.");
                        hasKey = true;
                        break;
                    }
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }
}
