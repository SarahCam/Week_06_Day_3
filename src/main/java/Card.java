public class Card {

    // Declare the following instance variables for the Card class:
    private SuitType suit;
    private ValueType value;

    // Create the constructor, which takes in a suit and value and assigns them to the Card class instance variables:
    public Card(SuitType suit, ValueType value){
        this.suit = suit;
        this.value = value;
    }

    // Method to expose the private Card 'suit' property to other classes:
    public SuitType getSuit(){
        return this.suit;
    }

    // Method to expose the private Card 'value' property to other classes:
    public ValueType getValue(){
        return this.value;
    }
}
