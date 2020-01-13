/*
        MainMenu class is responsible for showing menu to the user every time user wants to do something
        with array of minions, also takes care with inappropriate input for the menu
 */

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MainMenu {
    private int userInput;
    private String menuTitle = "Main Menu";
    private String[] menuOptions = {"List minions", "Add a new minion", "Remove minion",
            "Attribute an evil deed to a minion", "Debug dump of minion details", "Exit"};

    public void drawTitleCeilingOrFloor() {

        final int starIndent = 4;

        IntStream.range(0, menuTitle.length() + starIndent)
                .forEach(i -> System.out.print("*"));

        System.out.println();
    }

    public void drawMidSectionMenu() {
        System.out.println("* " + menuTitle + " *");
    }

    public void drawTitleBanner() {
        drawTitleCeilingOrFloor();
        drawMidSectionMenu();
        drawTitleCeilingOrFloor();
    }

    public void printMenuOptions() {
        drawTitleBanner();
        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }
    }


    public boolean initialCheck(int input, List<Minion> minions) {
        while (input < 1 || input > menuOptions.length) {
            Scanner newInput = new Scanner(System.in);
            System.out.println("Error: Please enter a number between 1 and 6");
            input = newInput.nextInt();
        }
        return optionChosen(input, minions);

    }

    public boolean optionChosen(int input, List<Minion> minions) {
        Minion utilVar = new Minion();
        switch (input) {
            case 1:
                utilVar.printMinions(minions);
                break;
            case 2:
                utilVar.addNewMinion(minions);
                break;
            case 3:
            case 4:
                utilVar.selectMinionOrCancel(input, minions);
                break;
            case 5:
                utilVar.debugDump(minions);
                break;
            case 6:
                return true;
        }
        return false;
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public MainMenu(int userInput) {
        this.userInput = userInput;
    }
}
