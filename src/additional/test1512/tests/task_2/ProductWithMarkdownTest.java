package additional.test1512.tests.task_2;

import additional.test1512.task_2.ProductWithMarkdown;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductWithMarkdownTest {
    @Test
    public void toString1() {
        ProductWithMarkdown pr1 = new ProductWithMarkdown("Banana", 10, 50, "beaten");
        Assertions.assertEquals("Banana, Цена - 10.0, Скидка - 50.0%, Уценка - beaten",  pr1.toString());
    }
}
