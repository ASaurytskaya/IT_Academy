package additional.test1512.tests.task_2;

import additional.test1512.task_2.Basket;
import additional.test1512.task_2.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    public void addProduct1() {
        Basket basket = new Basket();
        basket.addProduct(new Product("Milk", 2.35), 2);
        Assertions.assertEquals(1, basket.getProductsToBuy().size());
    }
}
