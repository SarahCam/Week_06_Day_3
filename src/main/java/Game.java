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

    // GETTER:
    public Deck getDeck(){
        return this.deck;
    }

    // Method to add a new player to the game:
    public void addPlayer(Player player){
        this.players.add(player);
    }

    // Method to play highest card game:
    public Player playHighestCard(){
        int maxHand = 0;                            // Initialize maxHand
        Player winner = new Player("Nobody");       // Ghost player!! with no cards, to compare to...
        this.deck.populate();                       // Populate the deck with 52 cards
        for(Player player : this.players){          // For each player:
            Card card = this.deck.deal();           // Remove a card from the top of the deck
            player.getHand().addCard(card);         // Add that card to that player's hand
            if (player.getHand().sumCards() > maxHand){
                winner = player;
            }
        }
        return winner;
    }

}
