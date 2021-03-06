/*
*    Main class creates ArrayList of minions which will be filled by using MainMenu and Minion classes
*    main purpose of Main class is to give info from the user to other classes
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MainMenu utilVar = new MainMenu (0);

        List<Minion> minions = new ArrayList<>();

        boolean shouldEnd = false;

        System.out.println("Welcome to the Evil Minion Tracker (tm)" +
                          "\nby Valentyn Shlapachenko (ID:301354187).");

        Scanner input = new Scanner(System.in);

        while(!shouldEnd) {

            utilVar.printMenuOptions();

            utilVar.setUserInput(input.nextInt());

            shouldEnd = utilVar.initialCheck(utilVar.getUserInput(), minions);
        }
    }
}