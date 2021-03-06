import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before(){

        card = new Card(SuitType.HEARTS, ValueType.ACE);     // Create a new card with ENUM values
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValue(){
        assertEquals(ValueType.ACE, card.getValue());
    }

    @Test
    public void canGetValueValue(){
        assertEquals(1, card.getValueValue());
    }

}