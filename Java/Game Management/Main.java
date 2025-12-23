import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameManager manager = new GameManager();

        ManagerInterface managerInterface = new ManagerInterface(manager, scanner);
        managerInterface.startMenu();
    }
}
