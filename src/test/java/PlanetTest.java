import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    private Planet mars;

    @Before
    public void before(){
        mars = new Planet("mars", 908973);
    }

    @Test
    public void hasName(){
        assertEquals("mars", mars.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(908973, mars.getSize());
    }

    @Test
    public void explodes(){
        assertEquals("Boom! mars has exploded!", mars.explode());
    }
}
