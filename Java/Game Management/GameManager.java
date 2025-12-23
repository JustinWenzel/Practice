
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GameManager {
    private List<Game> games;

    public GameManager(){
        this.games = new ArrayList<>();
    }

    public void addGame(Scanner scanner){
        System.out.println("What is the name of the game?");
        String name = scanner.nextLine();

        System.out.println("Choose the genre: \n 1. Horror \n 2. Action \n 3. Shooter \n 4. Adventure");
        int genre = scanner.nextInt();

        System.out.println("When did the game release? (YYYY-MM-DD)");
        String date = scanner.nextLine();
        LocalDate releasDate = LocalDate.parse(date);
         
    }
}
