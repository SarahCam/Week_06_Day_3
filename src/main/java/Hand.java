import java.util.ArrayList;

public class Hand {

    // INSTANCE VARIABLE: Declare the following private instance variable for the Hand class:
    private ArrayList<Card> cards;

    // SETTER: Create the constructor, which initializes the cards ArrayList to be an empty array of Card instances:
    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    // GETTER: Method to expose the private Hand 'cards' property to other classes:
    public ArrayList<Card> getCards(){
        return this.cards;
    }
}
