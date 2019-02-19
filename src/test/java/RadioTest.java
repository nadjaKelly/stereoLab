import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("BBC1", "Sony", "ABC123");

    }

    @Test
    public void hasTune(){
        assertEquals("BBC1", radio.tune());
    }

    @Test
    public void getMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("ABC123", radio.getModel());
    }



}
