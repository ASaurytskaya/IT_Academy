package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main4_2Test {
    @Test
    @DisplayName("Direct order")
    public void findAverageNumber1() {
        Assertions.assertEquals(5, home_work_1.Main4_2.findAverageNumber(1,5,9));
    }

    @Test
    @DisplayName("Reverse order")
    public void findAverageNumber2() {
        Assertions.assertEquals(5, home_work_1.Main4_2.findAverageNumber(9,5,0));
    }

    @Test
    @DisplayName("Out of order")
    public void findAverageNumber3() {
        Assertions.assertEquals(0, home_work_1.Main4_2.findAverageNumber(-2147483648,2147483647,0));
    }
}
