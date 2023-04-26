import java.util.Scanner;

public class WeddingScene {
    private String playerName;
    private Scanner scanner;
    
    public WeddingScene(String playerName) {
        this.playerName = playerName;
        this.scanner = new Scanner(System.in);
    }
    
    public void start() {
        System.out.println("Hi " + playerName + ", welcome to Wonderland!");
        System.out.println("Wonderland is a magical and whimsical place filled with strange creatures and unusual experiences. You never know what will happen next!");
        System.out.println("Please choose your fate by selecting an option:\n");
        System.out.println("You find yourself at your wedding party to Hamish. Do you:");
        System.out.println("1. Get married to Hamish");
        System.out.println("2. Follow the white rabbit");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You marry Hamish and live happily ever after.");
                break;
            case 2:
                RabbitHoleScene rabbitHoleScene = new RabbitHoleScene(playerName);
                rabbitHoleScene.start();
                break;
        default:
            System.out.println("Invalid choice. Please try again.");
            start();
    }
}

}

