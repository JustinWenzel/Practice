import java.time.LocalDate;

public class Singleplayer extends Game{
    private Boolean hasReachedEnd;

    public Singleplayer(String titel, Genre genre, LocalDate releaseDate, double price, int playtime, int review, Boolean hasReachedEnd){
        super(titel, genre, releaseDate, price, playtime, review);
        this.hasReachedEnd = hasReachedEnd;
    }

    
    public Boolean getHasReachedEnd() {
        return hasReachedEnd;
    }

    public void setHasReachedEnd(Boolean hasReachedEnd) {
        this.hasReachedEnd = hasReachedEnd;
    }
    
}
