import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinkTest {
    Drink drink1;
    Drink drink2;

    @Before
    public void before(){
        drink1 = new Drink("Coca Cola", "Coca Cola Company");
        drink2 = new Drink("Pepsi", "PepsiCo");
    }

    @Test
    public void canGetName(){
        assertEquals("Coca Cola", drink1.getName());
        assertEquals("Pepsi", drink2.getName());
    }

    @Test
    public void canGetBrand(){
        assertEquals("Coca Cola Company", drink1.getBrand());
        assertEquals("PepsiCo", drink2.getBrand());
    }

    @Test
    public void canGetPrice(){
        assertEquals(1.00, drink1.getPrice(), 0.0);
        assertEquals(1.00, drink2.getPrice(),0.0);
    }


}
