import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Sarah");
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah", player.getName());
    }

}
