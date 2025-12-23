import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameManager {
    private List<Singleplayer> singleplayer;
    private List<Multiplayer> multiplayer;
    private Map<Integer, List<Game>> games;

    public GameManager(){
        this.singleplayer = new ArrayList<>();
        this.multiplayer = new ArrayList<>();
        this.games = new HashMap<Integer, List<Game>>();
        this.games.put(1, singleplayer);
        this.games.put(2, multiplayer);
    }
}
