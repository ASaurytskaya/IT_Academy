package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main4_6Test {
    @Test
    public void isLeapYear1() {
        Assertions.assertTrue(home_work_1.Main4_6.isLeapYear(2020));
    }

    @Test
    public void isLeapYear2() {
        Assertions.assertTrue(home_work_1.Main4_6.isLeapYear(800));
    }

    @Test
    public void isLeapYear3() {
        Assertions.assertFalse(home_work_1.Main4_6.isLeapYear(300));
    }

    @Test
    public void isLeapYear4() {
        Assertions.assertFalse(home_work_1.Main4_6.isLeapYear(2021));
    }
}
