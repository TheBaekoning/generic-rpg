package client;

import game.client.Client;
import model.entities.Player;
import org.junit.Assert;
import org.junit.Test;


public class ClientTest {

    @Test
    public void initializationSuccess() {
        // assemble
        Player player;

        // act
        player = Client.initialize();

        // assert
        Assert.assertNotNull(player);
        Assert.assertEquals(100, player.getHealth());
        Assert.assertEquals("John Doe", player.getName());
        Assert.assertEquals(1, player.getLevel());
    }

}
