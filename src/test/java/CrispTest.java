import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    Crisp crisp;

    @Before
    public void before(){

        crisp = new Crisp("Doritos", "Walkers");
    }

    @Test
    public void canGetName(){
        assertEquals("Doritos", crisp.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Walkers", crisp.getBrand());
    }

    @Test

    public void canGetPrice(){
    assertEquals(0.50, crisp.getPrice(),00);
    }

}
