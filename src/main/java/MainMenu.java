import java.util.List;
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


    public void initialCheck(int input, List<Minion> minions) {
        if (input < 1 || input > menuOptions.length) {
            System.out.println("Error: Please enter a number between 1 and 6, thank you");
        } else {
            optionChosen(input, minions);
        }
    }

    public void optionChosen(int input, List<Minion> minions) {
        Minion utilVar = new Minion();
        switch (input) {
            case 1:
                utilVar.listMinionsTitle();
                utilVar.printMinions(minions);
                break;
            case 2:
                //utilVar.addNewMinion();
            case 3:

        }
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
