public class Player {

    // INSTANCE VARIABLES:
    private String name;
    private Hand hand;

    // SETTER: CONSTRUCTOR:
    public Player(String name){
        this.name = name;
        this.hand = new Hand();
    }

    // GETTER:
    public String getName(){
        return this.name;
    }
}
