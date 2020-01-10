/*
      System.out.println("Welcome to the Evil Minion Tracker (tm)" +
                          "\nby Valentyn Shlapachenko (ID:301354187).");
  */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        List<Minion> minions = new ArrayList<>();

        minions.add(new Minion(0,1.73, "Olin"));

        System.out.println("first is: " + minions.get(0));


        Scanner input = new Scanner (System.in);

        int userInput = input.nextInt();

        MainMenu.initialCheck(userInput);

        MainMenu menu = new MainMenu();

        menu.printMenuOptions();
    }




}
