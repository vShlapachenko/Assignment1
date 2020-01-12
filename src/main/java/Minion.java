/*
 *  Represent minion info (Number of evil deeds, its height and name)
 */

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Minion {
    private int evil_deeds_counter;
    private double height;
    private String name;

    public Minion(int evil_deeds_counter, double height, String name) {
        this.evil_deeds_counter = evil_deeds_counter;
        this.height = height;
        this.name = name;
    }

    public Minion() {
        this.evil_deeds_counter = 0;
        this.height = 0.0;
        this.name = "Utility Variable";
    }

    public int getEvil_deeds_counter() {
        return evil_deeds_counter;
    }

    public void setEvil_deeds_counter(int evil_deeds_counter) {
        this.evil_deeds_counter = evil_deeds_counter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                " evil_deeds_counter=" + evil_deeds_counter +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }

    public void listMinionsTitle() {
        String introToListOfMinions = "List of Minions:";
        System.out.println(introToListOfMinions);
        IntStream.range(0, introToListOfMinions.length())
                .forEach(i -> System.out.print('*'));
        System.out.println();
    }

    public void printMinions(List<Minion> minions) {
        if (minions.size() == 0) {
            System.out.println("No minions found.");
            return;
        }
        for (int i = 0; i < minions.size(); i++) {
            System.out.print((i + 1) + ". ");
            printSingleMinion(minions.get(i));
        }
    }

    public void printSingleMinion(Minion minion) {
        System.out.print(minion.getName() + ", ");
        System.out.print(minion.getHeight() + "m, ");
        System.out.print(minion.getEvil_deeds_counter() + " evil deed(s)");
        System.out.println();
    }

    public static void addNewMinion(List<Minion> minions){
        System.out.println("Enter minion's name: ");
        Scanner input = new Scanner(System.in);
        String minionName = input.nextLine();
        System.out.println("Enter minion's height: ");
        double height = input.nextDouble();
        //double height = 0.0;
        minions.add(new Minion(0, height, minionName));
    }




}
