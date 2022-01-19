import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ChangeReturnSlotTest {
    ChangeReturnSlot changeReturnSlot1;
    ArrayList<Coin> coinsReturned;
    Coin coin1;
    Coin coin2;


    @Before
    public void before(){
        coinsReturned = new ArrayList<Coin>();
        changeReturnSlot1 = new ChangeReturnSlot(coinsReturned);
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.TEN);
    }


    @Test
    public void canGetCoinsReturnedSize(){
        assertEquals(0, changeReturnSlot1.getCoinsReturnedSize());
    }

    @Test
    public void canAddCoin(){
        changeReturnSlot1.addCoin(coin1);
        assertEquals(1, changeReturnSlot1.getCoinsReturnedSize());
    }

    @Test
    public void canGetTotal(){
        changeReturnSlot1.addCoin(coin1);
        changeReturnSlot1.addCoin(coin2);
        changeReturnSlot1.addCoin(coin1);
        assertEquals(1.10, changeReturnSlot1.getCoinsTotal(),0.0);
    }



}
