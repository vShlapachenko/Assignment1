/*
 *  Represent minion info (Number of evil deeds, its height and name)
 */

public class Minion {
    private int evil_deeds_counter;
    private double height;
    private String name;

    public Minion(int evil_deeds_counter, double height, String name) {
        this.evil_deeds_counter = evil_deeds_counter;
        this.height = height;
        this.name = name;
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

    public static void listMinions(){
        String optionNaming = "List of Minions:";
        int length = optionNaming.length();
        String floor = new String(new char[length]).replace('\0' , '*');
        String namingAndFloor = optionNaming.substring(0, length) + "\n" + floor;
        System.out.println(namingAndFloor);
    }
}
