/*
      System.out.println("Welcome to the Evil Minion Tracker (tm)" +
                          "\nby Valentyn Shlapachenko (ID:301354187).");
  */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MainMenu utilVar = new MainMenu (0);

        utilVar.printMenuOptions();

        List<Minion> minions = new ArrayList<>();

        Minion.addNewMinion(minions);

//        minions.add(new Minion(0,1.73,"oleg"));
//
//        minions.add(new Minion(0,1.73,"oleg"));
//
//        minions.add(new Minion(0,1.73,"oleg"));

        Scanner input = new Scanner(System.in);

        utilVar.setUserInput(input.nextInt());

        utilVar.initialCheck(utilVar.getUserInput(), minions);


    }
}
