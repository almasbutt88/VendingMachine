import behaviours.IProduct;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Drawer drawer1;
    ArrayList<IProduct> products;
    IProduct product1;

    @Before
    public void before(){
        products = new ArrayList<IProduct>();
        drawer1  = new Drawer(DrawerCode.A1, products);
        product1 = new Sweet("Snickers", "Mars");
    }

    @Test
    public void canGetDrawerCode(){
        System.out.println(product1);
        System.out.println(products);
        assertEquals(DrawerCode.A1, drawer1.getDrawerCode());
    }

    @Test
    public void canGetProducts(){
        assertEquals(0, drawer1.getProductsSize());
    }

    @Test
    public void canAddProducts(){
        drawer1.addProduct(product1);
        assertEquals(1, drawer1.getProductsSize());
    }
}
