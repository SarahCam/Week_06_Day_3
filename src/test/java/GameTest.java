import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1, player2;

    @Before
    public void before(){
        game = new Game();
        player1 = new Player("Sarah");
        player2 = new Player("Jamie");
    }

    @Test
    public void canGetPlayers___NO_PLAYERS(){
        assertEquals(0, game.getPlayers().size());
    }

    @Test
    public void canAddPlayers___TWO_PLAYERS(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.getPlayers().size());
    }

    @Test
    public void canGetDeck___EMPTY_DECK(){
        assertEquals(0, game.getDeck().getCards().size());
    }

    @Test
    public void canPopulateGameDeck(){
        game.getDeck().populate();
        assertEquals(52, game.getDeck().getCards().size());
    }

}
