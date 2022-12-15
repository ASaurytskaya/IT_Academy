package additional.test1512.tests.task_2;

import additional.test1512.task_2.ProductWithDiscount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductWithDiscountTest {
    @Test
    public void toString1() {
        ProductWithDiscount pr1 = new ProductWithDiscount("TV", 8365, 31);
        Assertions.assertEquals("TV, Цена - 8365.0, Скидка - 31.0%",  pr1.toString());
    }
}
