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

    // Method to add a card to the Hand instance's cards ArrayList:
    public void addCard(Card card){
        this.cards.add(card);
    }

    // Method to sum card values in the Hand instance:
    // We need to use our method to get the enumValue of our ValueType value keys here:
    public int sumCards(){
        int total = 0;
        for(Card card : this.cards){
            total += card.getValueValue();
        }
        return total;
    }
}
