public class absolemCaterpillar {

    public void show(String item) {
        if (item.equals("calendar")) {
            System.out.println("\nGood you're here. I've been expecting you. You may want to take a look at this. Here is the calendar. As you can see, Frabjous day is approaching.");
            System.out.println("On that day you will have to slay the Jabberwocky to save Underland.");
        } else {
            System.out.println("I'm sorry, I don't have a " + item + " to show you.");
        }
    }

}
