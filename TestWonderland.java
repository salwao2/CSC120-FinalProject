import java.util.Scanner;

public class TestWonderland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine();
        
        WeddingScene weddingScene = new WeddingScene(playerName);
        weddingScene.start();
        
        Underland underland = new Underland(playerName);
        underland.start();
        
        scanner.close();
    }
}

