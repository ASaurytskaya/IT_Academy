package additional.test1512.tests.task_2;

import additional.test1512.task_2.Basket;
import additional.test1512.task_2.Check;
import additional.test1512.task_2.Product;
import additional.test1512.task_2.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopTest {
    Shop shop = new Shop();

    @Test
    public void addProduct1() {
        shop.addProduct(new Product("Milk", 2.35));
        Assertions.assertEquals(1, shop.getAllProducts().size());
    }

    @Test
    public void addProduct2() {
        Product pr1 = new Product("Milk", 2.35);
        shop.addProduct(pr1);
        Assertions.assertEquals(pr1, shop.getAllProducts().get(0));
    }

    @Test
    public void getCheck() {
        Product pr1 = new Product("Milk", 2.35);
        Basket basket = shop.getBasket();
        basket.addProduct(pr1, 2);
        Check check = shop.getCheck(basket);
        String s = check.toString();
        Assertions.assertEquals("1. Milk, Цена - 2.35, Количество - 2.0, Сумма - 4.7\n" +
                "Итого надо заплатить: 4.7", s);
    }
}
