import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Card card, card2;

    @Before
    public void before(){
        hand = new Hand();
        card = new Card(SuitType.CLUBS, ValueType.TWO);
        card2 = new Card(SuitType.SPADES, ValueType.EIGHT);
    }

    @Test
    public void canGetCards(){
        assertEquals(0, hand.getCards().size());
    }

    @Test
    public void canAddCard(){
        hand.addCard(card);
        assertEquals(1, hand.getCards().size());
        Card firstCard = hand.getCards().get(0);
        assertEquals(SuitType.CLUBS, firstCard.getSuit());
        assertEquals(ValueType.TWO, firstCard.getValue());
    }

    @Test
    public void canSumCards(){
        hand.addCard(card);
        hand.addCard(card2);
        assertEquals(10, hand.sumCards());
    }
}
