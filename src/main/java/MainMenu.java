public class MainMenu {
    private String menuTitle = "Main Menu";
    private static String[] menuOptions = {"List minions", "Add a new minion", "Remove minion",
            "Attribute an evil deed to a minion", "Debug dump of minion details", "Exit"};


//    public MainMenu() {
//        menuTitle = "Main Menu";
//        menuOptions[0] = "List minions";
//        menuOptions[1] = "Add a new minion";
//        menuOptions[2] = "Remove minion";
//        menuOptions[3] = "Attribute an evil deed to a minion";
//        menuOptions[4] = "Debug dump of minion details";
//        menuOptions[5] = "Exit";
//    }

    public void printMenuTitle(){
        boolean halfDrawn = false;
        int length = menuTitle.length();
        halfDrawn = rectangleDrawer(halfDrawn, length);
        System.out.print(menuTitle);
        rectangleDrawer(halfDrawn, length);
    }

    public boolean rectangleDrawer(boolean halfDrawn, int length){
        int starIndent = 4;
        String floorAndCeiling = new String(new char[length + starIndent]).replace('\0' , '*'); //https://stackoverflow.com/questions/2804827/create-a-string-with-n-characters
        if (!halfDrawn) {
            String ceilingAndLWall = floorAndCeiling.substring(0, length + starIndent) + "\n* "; // https://stackoverflow.com/questions/6952363/replace-a-character-at-a-specific-index-in-a-string
            System.out.print(ceilingAndLWall);
            halfDrawn = true;
        }
        else{
            String rWallAndFloor = " *\n" + floorAndCeiling.substring(0, length + starIndent);
            System.out.println(rWallAndFloor);
        }
        return halfDrawn;
    }

    public void printMenuOptions(){
        printMenuTitle();
        for(int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }
    }


    public static void initialCheck(int input){
        if (input < 1 || input > menuOptions.length){
            System.out.println("Please enter a number between 1 and 6, thank you");
        }
        else{
            optionChosen(input);
        }
    }

    public static void optionChosen(int input){
        System.out.println("AHAHAHAHAHAHHAHAHAHAH\n\n\n\n\n\n\n\n\n");
        switch (input){
            case 1:
                Minion.listMinions();

        }
    }
}
