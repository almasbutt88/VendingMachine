import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {
    Coin coin1;
    Coin coin2;

    @Before
    public void before(){
        coin1 = new Coin(CoinType.TEN);
        coin2 = new Coin(CoinType.ONEP);
    }

    @Test
    public void hasCoinValue(){
        assertEquals(0.1, coin1.getCoinValue(), 0.0);
        assertEquals(1, coin2.getCoinValue(), 0.0);
    }

}
