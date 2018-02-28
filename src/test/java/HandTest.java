import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Card card;

    @Before
    public void before(){
        hand = new Hand();
        card = new Card(SuitType.CLUBS, ValueType.TWO);
    }

    @Test
    public void canGetCards(){
        assertEquals(0, hand.getCards().size());
    }

//    @Test
//    public void canAddCard(){
//        hand.addCard(card);
//        assertEquals(1, hand.getCards().size());
//    }
}
