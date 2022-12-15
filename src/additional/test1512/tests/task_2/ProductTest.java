package additional.test1512.tests.task_2;

import additional.test1512.task_2.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void toString1() {
        Product pr1 = new Product("Milk", 2.35);
        Assertions.assertEquals("Milk, Цена - 2.35",  pr1.toString());
    }
}
