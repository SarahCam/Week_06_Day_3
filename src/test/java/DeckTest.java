import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canGetCards(){
        assertEquals(0, deck.getCards().size());
    }

    @Test
    public void canPopulate___HAVE_52_CARDS(){
        deck.populate();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canPopulate___HAVE_EACH_KIND_OF_CARD_IN_DECK___SAMPLE_TEST(){
        deck.populate();
        Card firstCard = deck.getCards().get(0);
        assertEquals(SuitType.HEARTS, firstCard.getSuit());
        assertEquals(ValueType.ACE, firstCard.getValue());
        Card lastCard = deck.getCards().get(51);
        assertEquals(SuitType.CLUBS, lastCard.getSuit());
        assertEquals(ValueType.KING, lastCard.getValue());
    }

    @Test
    public void canDeal___UNSHUFFLED_DECK_OF_CARDS(){
        deck.populate();
        Card card = deck.deal();
        assertEquals(SuitType.HEARTS, card.getSuit());
        assertEquals(ValueType.ACE, card.getValue());

    }

}
