import behaviours.IProduct;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class VendingMachineTest {

    VendingMachine vendingMachine;
    ArrayList<Drawer>drawersList;
    ArrayList<Coin>coinList;
    ChangeReturnSlot changeReturnSlot;
    private ArrayList<Coin> coinsReturned;
    Coin coin1;
    Coin coin2;
    Sweet sweet1;
    Sweet sweet2;
    Crisp crisp;
    Drink drink1;
    Drink drink2;
    Drawer drawer1;
    ArrayList<IProduct> products;
    IProduct product1;

    @Before

    public void before(){
        vendingMachine = new VendingMachine(drawersList, coinList, changeReturnSlot);
        drawersList = new ArrayList<Drawer>();
        coinList = new ArrayList<Coin>();
        changeReturnSlot = new ChangeReturnSlot(coinsReturned);
        coinsReturned = new ArrayList<Coin>();
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.TEN);
        sweet1 = new Sweet("Snickers", "Mars");
        sweet2 = new Sweet("Bounty", "Mars");
        crisp = new Crisp("Doritos", "Walkers");
        drink1 = new Drink("Coca Cola", "Coca Cola Company");
        drink2 = new Drink("Pepsi", "PepsiCo");
        products = new ArrayList<IProduct>();
        drawer1  = new Drawer(DrawerCode.A1, products);
        product1 = new Sweet("Snickers", "Mars");

    }

    @Test
    public void hasDrawersList(){
        assertEquals(0, vendingMachine.getDrawersListSize());
    }
    
    @Test 
    public void canAddDrawer(){
        vendingMachine.addDrawer(drawer1);
        assertEquals(2, vendingMachine.getDrawersListSize());
    }
    
    

    @Test
    public void hasChangeReturnSlot(){
        assertEquals(0, vendingMachine.getChangeReturnSlotSize());
    }

}
