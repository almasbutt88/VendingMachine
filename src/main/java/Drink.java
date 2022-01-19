import behaviours.IProduct;

public class Drink implements IProduct {

    private String name;
    private String brand;
    private double price;



    public Drink(String _name, String _brand){
        this.name = _name;
        this.brand = _brand;
        this.price = 1.00;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
