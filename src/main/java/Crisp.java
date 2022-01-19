import behaviours.IProduct;

public class Crisp implements IProduct {

    private String name;
    private String brand;
    private double price;



    public Crisp(String _name, String _brand){
        this.name = _name;
        this.brand = _brand;
        this.price = 0.50;
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
