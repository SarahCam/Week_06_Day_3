import java.util.ArrayList;

public class Deck {

    // INSTANCE VARIABLE: Declare the following private instance variable for the Deck class:
    private ArrayList<Card> cards;

    // SETTER: Create the constructor, which initializes the cards ArrayList to be an empty array of Card instances:
    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    // GETTER: Method to expose the private Deck 'cards' property to other classes:
    public ArrayList<Card> getCards(){
        return this.cards;
    }

    // Method to populate our empty deck of cards with all 52 playing cards:
    // For each suit in our list of SuitType values, i.e. HEARTS, DIAMONDS, SPADES, CLUBS
    // And then for each value in our list of ValueType values, i.e. ACE, TWO, THREE,...KING
    // Add a new card with that suit and that value to the Deck's cards ArrayList:
    public void populate(){
        for(SuitType suit : SuitType.values()){
            for(ValueType value : ValueType.values()){
                Card card = new Card(suit, value);
                this.cards.add(card);
            }
        }
    }

    // Method to *remove* the top card from the deck:
    public Card deal(){
        return this.cards.remove(0);
    }

}
