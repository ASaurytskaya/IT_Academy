package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main5Test {
    @Test
    @DisplayName("Weekday, vacation")
    public void sleepIn1() {
        Assertions.assertTrue(home_work_1.Main5.sleepIn(true, true));
    }

    @Test
    @DisplayName("Weekend, vacation")
    public void sleepIn2() {
        Assertions.assertTrue(home_work_1.Main5.sleepIn(false, true));
    }

    @Test
    @DisplayName("Weekday, no vacation")
    public void sleepIn3() {
        Assertions.assertFalse(home_work_1.Main5.sleepIn(true, false));
    }

    @Test
    @DisplayName("Weekend, no vacation")
    public void sleepIn4() {
        Assertions.assertTrue(home_work_1.Main5.sleepIn(false, false));
    }
}
