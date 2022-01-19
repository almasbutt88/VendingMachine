import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before(){
        sweet = new Sweet("Snickers", "Mars");
    }

    @Test
    public void canGetName(){
        assertEquals("Snickers", sweet.getName());
    }
    @Test
    public void canGetBrand(){
        assertEquals("Mars", sweet.getBrand());
    }
    @Test
    public void canGetPrice(){
        assertEquals(0.65, sweet.getPrice(), 0);
    }
}
