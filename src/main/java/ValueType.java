public enum ValueType {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);       // Don't forget the semi-colon!

    // INSTANCE VARIABLE: Declare a private instance variable called enumValue, which is 'final', i.e cannot be changed:
    private final int enumValue;

    // SETTER: Create the constructor, which:
    // - Takes in the enumValue from the above enumKey(enumValue) pairs
    // - Assigns it to the declared private instance variable: enumValue
    ValueType(int enumValue){
        this.enumValue = enumValue;
    }

    // GETTER: Method to expose the private ValueType 'enumValue' property to other classes:
    public int getEnumValue() {
        return this.enumValue;
    }
}
