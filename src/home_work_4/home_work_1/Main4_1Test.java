package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main4_1Test {
    @Test
    @DisplayName("Positive odd number")
    public void isOdd1() {
        Assertions.assertTrue(home_work_1.Main4_1.isOdd(5));
    }

    @Test
    @DisplayName("Negative odd number")
    public void isOdd2() {
        Assertions.assertTrue(home_work_1.Main4_1.isOdd(-5));
    }

    @Test
    @DisplayName("Zero")
    public void isOdd3() {
        Assertions.assertFalse(home_work_1.Main4_1.isOdd(0));
    }
}
