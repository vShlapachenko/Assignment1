/*
    Minion class takes care of commands retrieved from MainMenu class, checks whether they are appropriate
    if they are Minion class implements them
 */
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Minion {
    private int evilDeedsCounter;
    private double height;
    private String name;

    public Minion(int evilDeedsCounter, double height, String name) {
        this.evilDeedsCounter = evilDeedsCounter;
        this.height = height;
        this.name = name;
    }

    public Minion() {
        this.evilDeedsCounter = 0;
        this.height = 0.0;
        this.name = "Utility Variable";
    }

    public int getEvilDeedsCounter() {
        return evilDeedsCounter;
    }

    public void setEvilDeedsCounter(int evilDeedsCounter) {
        this.evilDeedsCounter = evilDeedsCounter;
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

    @Override
    public String toString() {
        return "Minion{" +
                "evil_deeds_counter=" + evilDeedsCounter +
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
        listMinionsTitle();
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
        System.out.print(minion.getEvilDeedsCounter() + " evil deed(s)");
        System.out.println();
    }

    public void addNewMinion(List<Minion> minions) {
        System.out.println("Enter minion's name: ");
        Scanner input = new Scanner(System.in);
        String minionName = input.nextLine();
        double height = checkForCorrectHeight();

        minions.add(new Minion(0, height, minionName));
    }

    public double checkForCorrectHeight(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter minion's height: ");
            double height = input.nextDouble();
            if(height >= 0){
                return height;
            }
            System.out.println("ERROR: height must be >= 0.");
        }

    }

    public void selectMinionOrCancel(int userInput, List<Minion> minions) {
        printMinions(minions);
        System.out.println("(Enter 0 to cancel)");
        Scanner input = new Scanner(System.in);
        boolean correctInput = false;
        int minionToRemove;
        while (!correctInput) {
            correctInput = outOfBoundsCheck(minionToRemove = input.nextInt(), minions, userInput);
        }

    }

    public boolean outOfBoundsCheck(int selectedMinionOrCancel, List<Minion> minions, int removeMinionOrAddEvilDeed) {
        if (selectedMinionOrCancel < 0 || selectedMinionOrCancel > minions.size()) {
            System.out.println("Error: Please enter a selection between " + 0 + " and " + minions.size());
            return false;
        }
        if (removeMinionOrAddEvilDeed == 3 && selectedMinionOrCancel != 0) {
            removeMinion(selectedMinionOrCancel - 1, minions);
        } else if (removeMinionOrAddEvilDeed == 4 && selectedMinionOrCancel != 0) {
            incrementEvilDeed(selectedMinionOrCancel - 1, minions);
        }

        return true;
    }

    public void removeMinion(int minionToRemove, List<Minion> minions) {
        minions.remove(minionToRemove);
    }

    public void incrementEvilDeed(int minionToIncrement, List<Minion> minions) {
        int incrementedEvilDeeds = minions.get(minionToIncrement).getEvilDeedsCounter() + 1;
        minions.get(minionToIncrement).setEvilDeedsCounter(incrementedEvilDeeds);
        System.out.println(minions.get(minionToIncrement).getName()
                + " has now down "
                + minions.get(minionToIncrement).getEvilDeedsCounter()
                + " deed(s)!");
    }

    public void debugDump(List<Minion> minions){
        System.out.println("All minion objects:");
        for (int i = 0; i < minions.size(); i++) {
            System.out.println((i + 1) + ". " + minions.get(i));
        }
    }
}
