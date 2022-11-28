package home_work_4.home_work_1;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main4_3Test {
    @Test
    @DisplayName("Division without remainder")
    public void isOdd1() {
        Assertions.assertEquals("Число 10 делится на число 2 без остатка, частное равно 5.",
                home_work_1.Main4_3.printModulo(10, 2));
    }

    @Test
    @DisplayName("Division with remainder")
    public void isOdd2() {
        Assertions.assertEquals("Число -10 не делится на число 4, частное равно -2, остаток равен -2.",
                home_work_1.Main4_3.printModulo(-10, 4));
    }

    @Test
    @DisplayName("Division by zero")
    public void isOdd3() {
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            home_work_1.Main4_3.printModulo(10, 0);
        });
    }
}
