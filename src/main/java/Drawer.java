import behaviours.IProduct;

import java.util.ArrayList;

public class Drawer {
    private DrawerCode drawerCode;
    private ArrayList<IProduct> productsList;

    public Drawer(DrawerCode drawerCode, ArrayList<IProduct> productsList) {
        this.drawerCode = drawerCode;
        this.productsList = new ArrayList<IProduct>(productsList);
    }

    public DrawerCode getDrawerCode() {
        return drawerCode;
    }

    public ArrayList<IProduct> getProductsList() {
        return productsList;
    }

    public int getProductsSize() {
        return productsList.size();
    }

    public void addProduct(IProduct _product) {
        productsList.add(_product);
    }
}
