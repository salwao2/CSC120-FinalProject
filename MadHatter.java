import java.util.Scanner;

class MadHatter {
    public void greet() {
        System.out.println("Mad Hatter: Ah, welcome to our little tea party!");
    }

    public void askForQuestions(Scanner scanner) {
        String choice = "";
        while (!choice.equals("1") && !choice.equals("2")) {
            System.out.println("\nMad Hatter: Do you have any questions for me?\n1. What does the White Queen want to discuss?\n2. No, please continue talking.");
            choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Mad Hatter: I'm sorry, I didn't understand. Please enter '1' or '2'.");
            }
        }

        if (choice.equals("1")) {
            System.out.println("\nMad Hatter: The White Queen wishes to inform you on the powers of the Vorpal Sword and how to retrieve it.");
        } else {
            System.out.println("\nMad Hatter: The White Queen wishes to inform you on the powers of the Vorpal Sword and how to retrieve it.");
            WhiteQueen();
        }
    }

    public void WhiteQueen() {
        System.out.println("Mad Hatter: I'm glad you found me. The White Queen has been insisting that I bring you to her. She has important information to discuss with you.");
    }
}



