import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canGetPlayers___NO_PLAYERS(){
        assertEquals(0, game.getPlayers().size());
    }
}
