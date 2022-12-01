package home_work_4.home_work_2.loops;

import home_work_2.loops.Main1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_3Test {
    @Test
    @DisplayName("Positive number, calculation")
    public void exponentiate1() {
        Assertions.assertEquals(32, Main1_3.exponentiate(2, 5));
    }

    @Test
    @DisplayName("Raise to zero, calculation")
    public void exponentiate2() {
        Assertions.assertEquals(1, Main1_3.exponentiate(2, 0));
    }

    @Test
    @DisplayName("Negative number, calculation")
    public void exponentiate3() {
        Assertions.assertEquals(-32, Main1_3.exponentiate(-2, 5));
    }

    @Test
    @DisplayName("Normal, calculation")
    public void printExponential() {
        Assertions.assertEquals("0.0 ^ 0 = 1.0", Main1_3.printExponential(0, 0, 1));
    }
}
