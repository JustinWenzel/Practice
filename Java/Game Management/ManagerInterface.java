import java.util.Scanner;

public class ManagerInterface {
    private final GameManager manager;
    private Scanner scanner;

    public ManagerInterface(GameManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }

    public void startMenu(){
        System.out.println("Hello welcome to the game management system. What do you want to do? (Press 1-6) \n 1. Add game \n 2. Remove game \n 3. Add playtime \n 4. Search game \n 5. Average playtime of all games \n 6. Save and quit");
        int menuOption = scanner.nextInt();

        switch (menuOption){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:



        }
    }

}
