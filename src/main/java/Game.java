import java.util.ArrayList;

public class Game {

    // INSTANCE VARIABLES:
    private ArrayList<Player> players;
    private Deck deck;

    // SETTER: CONSTRUCTOR:
    public Game(){
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
    }

    // GETTER:
    public ArrayList<Player> getPlayers(){
        return this.players;
    }

    // Method to add a new player to the game:
    public void addPlayer(Player player){
        this.players.add(player);
    }

}
