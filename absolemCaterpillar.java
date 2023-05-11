import java.util.Scanner;

public class absolemCaterpillar {
    public String playerName;

    public absolemCaterpillar(String playerName) {
        this.playerName = playerName;
    }

    public void greet() {
        System.out.println("\nAbsolem: Oh good you're here " + playerName + ". I've been expecting you. Frabjous day is approaching and we need you to save Underland.\n");
    }

    public void promptOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. You want to ME to save Underland?!");
        System.out.println("2. You have me mistaken. I am not the one you're looking for!");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Absolem: I knew you would say that. You are the only one who can save Underland!");
        } else if (option == 2) {
            System.out.println("Absolem: You seem not quite yourself today " + playerName + ".");
        } else {
            System.out.println("Absolem: I'm sorry, I didn't understand your response.");
        }
    }

    public void show(String item) {
        if (item.equals("calendar")) {
            System.out.println("\nYou may want to take a look at this, it's written in the calendar. On Frabjous Day, the White Queen will finally rule Underland again when you slay the Jabberwock.");
            System.out.println("+---------------+---------------+---------------+");
            System.out.println("|  Horunvendush |   Griblig Day |  Frabjous Day |");
            System.out.println("+---------------+---------------+---------------+");
            System.out.println("|The Red Queen  |" + playerName +"| ventured |Final clash    |");
            System.out.println("|took control of|into Underland |between White  |");
            System.out.println("|Underland      |               |and Red Queen's|");
            System.out.println("|               |               |forces         |");
            System.out.println("+---------------+---------------+---------------+");
        } else {
            System.out.println("I'm sorry, I don't have a " + item + " to show you.");
        }
    }

    public void askSaveUnderland() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAbsolem: The choice is up to you, " + playerName + ". Are you willing to save Underland?");
        System.out.println("1. Yes, I am willing to save Underland if I am the only one who can.");
        System.out.println("2. No, you've got the wrong " + playerName + ". I am not the " + playerName + " you are looking for.");
        int option = scanner.nextInt();
    
        if (option == 1) {
            System.out.println("\nAbsolem: Thank you, " + playerName + ". Your bravery will be remembered in Underland's history.");
            System.out.println("\nSuddenly, you all hear some rumbling and from the corner of your eye you see a beast charging straight at you and your friends\n");
            System.out.println("Tweedle Twins: It's the Red Queen's army and their Bandersnatch beast. RUNNNN!!\n");
            System.out.println("1. Run for your life!");
            System.out.println("2. Stay back to protect your friends");
        
            // ...
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            if (option == 1) {
                System.out.println("You ran as fast as you could, but you could hear your friends' screams in the distance. You know you have to find them!");
            } else if (option == 2) {
                System.out.println("\nYou and your friends try your best to fight off the Red Queen's Army and managed to poke the eye out of the Bandersnatch. Your friends distracted the army and told you to run away to find their friend the Mad Hatter for help as they got captured and taken away.");
            }
            
            System.out.println("\nYou start running and soon find yourself in a dense forest. You look around for any signs of the Mad Hatter, or anyone to help you, but you detect no signs of life. Keep looking.");

            String direction = "";
            while (!direction.equalsIgnoreCase("east")) {
                System.out.println("\nWhich direction do you want to head towards? (north/south/east/west)");
                direction = scanner.nextLine().toLowerCase();

                if (!direction.equals("east")) {
                    System.out.println("There's nobody in this neck of the woods, keep searching.");
                }
            }

            System.out.println("\nYou head towards the east and soon encounter the Cheshire Cat.");
            CheshireCat cheshireCat = new CheshireCat(playerName);
            cheshireCat.greetPlayer();
            cheshireCat.givedirections();

        
        } else if (option == 2) {
            System.out.println("\nAbsolem: Very well, " + playerName + ". You are free to go.");
            System.out.println("Absolem disappears beyond the smoke and the White Rabbit and Tweedle Twins leave Alice alone in the forest mumbling, 'See, I told you we had the wrong " + playerName + "'.\n");
            System.out.println("Alone in the forest, you hear a slight rumbling.");
            System.out.println("1. Run back to the entrance and return home.");
            System.out.println("2. Stay and wait to see what it is.");
    
            option = scanner.nextInt();
    
            if (option == 1) {
                System.out.println("\nYou run back to the entrance and return home. However, you have this lingering feeling of sadness as you didn't save Underland.");
                System.out.println("GAME OVER");
            } else if (option == 2) {
                System.out.println("\nThe Red Queen's army appears with the large Bandersnatch beast. You try your best to run, but without your friends to help you, you fail.");
                System.out.println("GAME OVER");
            } else {
                System.out.println("\nI'm sorry, " + playerName + ". That's not a valid choice.");
            }
        } else {
            System.out.println("\nAbsolem: I'm sorry, " + playerName + ". That's not a valid choice.");
        }

        scanner.close();
        
    } 
}