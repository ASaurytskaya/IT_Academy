package home_work_4.home_work_2.arrays;

import home_work_2.arrays.DoWhileOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DoWhileOperationTest {

    @Test
    @DisplayName("printAllElements(); normal array")
    public void printAllElements1() {
        Assertions.assertEquals("1 | 2 | 3 | ", DoWhileOperation.printAllElements(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("printAllElements(); zero array")
    public void printAllElements2() {
        Assertions.assertEquals("", DoWhileOperation.printAllElements(new int[]{}));
    }

    @Test
    @DisplayName("printAllElements(); null array")
    public void printAllElements3() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            DoWhileOperation.printAllElements(arr1);
        });
    }

    @Test
    @DisplayName("printEverySecondElement(); normal array")
    public void printEverySecondElement1() {
        Assertions.assertEquals("2 | ", DoWhileOperation.printEverySecondElement(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("printEverySecondElement(); zero array")
    public void printEverySecondElement2() {
        Assertions.assertEquals("", DoWhileOperation.printEverySecondElement(new int[]{}));
    }

    @Test
    @DisplayName("printEverySecondElement(); null array")
    public void printEverySecondElement3() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            DoWhileOperation.printEverySecondElement(arr1);
        });
    }

    @Test
    @DisplayName("printAllElementsReverse(); normal array")
    public void printAllElementsReverse1() {
        Assertions.assertEquals("3 | 2 | 1 | ", DoWhileOperation.printAllElementsReverse(new int[]{1,2,3}));
    }

    @Test
    @DisplayName("printAllElementsReverse(); zero array")
    public void printAllElementsReverse2() {
        Assertions.assertEquals("", DoWhileOperation.printAllElementsReverse(new int[]{}));
    }

    @Test
    @DisplayName("printAllElementsReverse(); null array")
    public void printAllElementsReverse3() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            DoWhileOperation.printAllElementsReverse(arr1);
        });
    }
}
