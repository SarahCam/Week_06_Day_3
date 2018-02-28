import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Sarah");
        card = new Card(SuitType.DIAMONDS, ValueType.SEVEN);
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah", player.getName());
    }

    @Test
    public void canGetHand___NO_CARDS(){
        assertEquals(0, player.getHand().getCards().size());
    }

    @Test
    public void canGetHand___1_CARD(){
        player.getHand().addCard(card);
        assertEquals(1, player.getHand().getCards().size());
        Card firstCard = player.getHand().getCards().get(0);
        assertEquals(SuitType.DIAMONDS, firstCard.getSuit());
        assertEquals(ValueType.SEVEN, firstCard.getValue());
    }

}
