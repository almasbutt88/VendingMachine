import java.util.ArrayList;

public class VendingMachine {
//Create a Vending Machine class with a list of drawers, list of coins entered and coin return.

    private ArrayList<Drawer>drawersList;
    private ArrayList<Coin>coinList;
    private ChangeReturnSlot changeReturnSlot;


    public VendingMachine(ChangeReturnSlot _changeReturnSlot){
        this.drawersList = new ArrayList<Drawer>(drawersList);
        this.coinList = new ArrayList<Coin>();
        this.changeReturnSlot = _changeReturnSlot;
    }



    public ArrayList<Drawer> getDrawersList() {
        return drawersList;
    }

    public ArrayList<Coin> getCoinList() {
        return coinList;
    }

    public ChangeReturnSlot getChangeReturn() {
        return changeReturnSlot;
    }

    public int getDrawersListSize() {
        return drawersList.size();
    }

    public int getChangeReturnSlotSize() {
        return changeReturnSlot.getCoinsReturnedSize();
    }

    public void addDrawer(Drawer drawer) {
        drawersList.add(drawer);
    }
}
