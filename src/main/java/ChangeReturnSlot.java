import java.util.ArrayList;

public class ChangeReturnSlot {


    private ArrayList<Coin> coinsReturned;


    public ChangeReturnSlot(ArrayList<Coin> coinsReturned){
        this.coinsReturned = new ArrayList<Coin>();
    }

    public ArrayList<Coin> getCoinsReturned() {
        return coinsReturned;
    }

    public int getCoinsReturnedSize() {
        return coinsReturned.size();
    }

    public void addCoin(Coin _coin) {
        coinsReturned.add(_coin);
    }



    public double getCoinsTotal() {

        double totalAmount = 0;
        for (Coin coin : coinsReturned){
            totalAmount += coin.getCoinValue();
        }

        return totalAmount;


    }

}
