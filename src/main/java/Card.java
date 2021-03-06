public class Card {

    // INSTANCE VARIABLES: Declare the following private instance variables for the Card class:
    private SuitType suit;
    private ValueType value;

    // SETTER: Create the constructor, which takes in a suit and value and assigns them to the Card class instance variables:
    public Card(SuitType suit, ValueType value){
        this.suit = suit;
        this.value = value;
    }

    // GETTER: Method to expose the private Card 'suit' property to other classes:
    public SuitType getSuit(){
        return this.suit;
    }

    // GETTER: Method to expose the private Card 'value' property to other classes:
    public ValueType getValue(){
        return this.value;
    }

    // GETTER: Method to get the actual value (key:value pair) of the 'value' enum:
    // e.g. if the key:value is ACE(1), then return the value '1'
    public int getValueValue(){
        return this.value.getEnumValue();
    }
}
