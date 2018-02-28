import java.util.ArrayList;

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

    // GETTER:
    public Hand getHand(){
        return this.hand;
    }
}
