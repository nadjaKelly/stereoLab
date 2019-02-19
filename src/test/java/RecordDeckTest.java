import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck(32,"Philips", "duh123");
    }



    @Test
    public void getSpinSpeed(){
        assertEquals(32, recordDeck.getSpinSpeed());
    }

    @Test
    public void play(){
        assertEquals("Snap, Crackle, Hiss", recordDeck.play());
    }

}
