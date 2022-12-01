package home_work_4.home_work_2.utils;

import home_work_2.utils.ArraysUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysUtilsTest {
    @Test
    @DisplayName("Correct length of an array")
    public void arrayRandom1() {
        int[] ar = ArraysUtils.arrayRandom(10, 20);
        Assertions.assertEquals(10, ar.length);
    }

    @Test
    @DisplayName("Correct max value of every element")
    public void arrayRandom2() {
        int[] ar = ArraysUtils.arrayRandom(10, 20);
        for(int i : ar) {
            Assertions.assertTrue(i < 20);
        }
    }

    @Test
    @DisplayName("Zero length")
    public void arrayRandom3() {
        int[] ar = ArraysUtils.arrayRandom(0, 20);
        Assertions.assertEquals(0, ar.length);
    }

    @Test
    @DisplayName("Negative length")
    public void arrayRandom4() {
        Assertions.assertNull(ArraysUtils.arrayRandom(-1, 0),
                "Размер массива не может быть отрицательным.");
    }
}
