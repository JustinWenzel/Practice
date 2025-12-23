import java.time.LocalDate;

public abstract class Game{
    private String titel;
    private Genre genre;
    private LocalDate releaseDate;
    private double price;
    private int playtime;
    private int review;

    public Game(String titel, Genre genre, LocalDate releaseDate, double price, int playtime, int review){
        this.titel = titel;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
        this.playtime = playtime;
        this.review = review;
    }

    public Game(String titel, Genre genre, LocalDate releaseDate, double price, int review){
        this.titel = titel;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.price = price;
        this.review = review;
    }

    public String getTitel(){
        return titel;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlaytime() {
        return playtime;
    }

    public void setPlaytime(int playtime) {
        this.playtime = playtime;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

}