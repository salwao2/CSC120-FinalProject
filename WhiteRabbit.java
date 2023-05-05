public class WhiteRabbit {

    public String playerName;

    public WhiteRabbit(String playerName) {
        this.playerName = playerName;
    }

    public void greet() {
        System.out.println("Welcome to Underland, " + playerName + "!");
        System.out.println("I am the White Rabbit. I've been searching for you everywhere!");
    }
}
