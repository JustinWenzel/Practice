import java.sql.Date;

public class Multiplayer extends Game {

    private int maxPlayers;

    public Multiplayer(String titel, Genre genre, Date releaseDate, double price, int playtime, int review, int maxPlayers){
        super(titel, genre, releaseDate, price, playtime, review);
        this.maxPlayers = maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    
}
