package additional.test1512.tests.task_2;

import additional.test1512.task_2.Check;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckTest {
    Check check = new Check();
    @Test
    public void addToCheck1() {
        check.addToCheck("TV, Цена - 8365.0, Скидка - 31.0%, Количество - 1, Сумма - 5908.47");
        Assertions.assertEquals(1, check.getProductsInCheck().size());
    }

    @Test
    public void toString1() {
        check.addToCheck("TV, Цена - 8365.0, Скидка - 31.0%, Количество - 1, Сумма - 5908.47");
        check.addToSum(5908.47);
        Assertions.assertEquals("1. TV, Цена - 8365.0, Скидка - 31.0%, Количество - 1, Сумма - 5908.47\n" +
                        "Итого надо заплатить: 5908.47",
                check.toString());
    }
}
