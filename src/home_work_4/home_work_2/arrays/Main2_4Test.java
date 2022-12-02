package home_work_4.home_work_2.arrays;

import home_work_2.arrays.Main2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main2_4Test {
    @Test
    @DisplayName("addPositiveIntegers(); no order, negative and positive numbers")
    public void addPositiveIntegers1() {
        Assertions.assertEquals(27, Main2_4.addPositiveIntegers(new int[]{1, 0, -25, 2, 3, -9, 9, 12}));
    }

    @Test
    @DisplayName("addPositiveIntegers(); all negative numbers")
    public void addPositiveIntegers2() {
        Assertions.assertEquals(0, Main2_4.addPositiveIntegers(new int[]{-1, -2, -3}));
    }

    @Test
    @DisplayName("addPositiveIntegers(); zero array")
    public void addPositiveIntegers3() {
        Assertions.assertEquals(0, Main2_4.addPositiveIntegers(new int[]{}));
    }

    @Test
    @DisplayName("addPositiveIntegers(); null array")
    public void addPositiveIntegers4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.addPositiveIntegers(arr1);
        });
    }

    @Test
    @DisplayName("findMaxWithEvenIndex(); no order, negative and positive numbers")
    public void findMaxWithEvenIndex1() {
        Assertions.assertEquals(9, Main2_4.findMaxWithEvenIndex(new int[]{1, 0, -25, 2, 3, -9, 9, 12}));
    }

    @Test
    @DisplayName("findMaxWithEvenIndex(); all numbers ones")
    public void findMaxWithEvenIndex2() {
        Assertions.assertEquals(1, Main2_4.findMaxWithEvenIndex(new int[]{1, 1, 1}));
    }

    @Test
    @DisplayName("findMaxWithEvenIndex(); zero array")
    public void findMaxWithEvenIndex3() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Main2_4.findMaxWithEvenIndex(new int[]{});
        });
    }

    @Test
    @DisplayName("findMaxWithEvenIndex(); null array")
    public void findMaxWithEvenIndex4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.findMaxWithEvenIndex(arr1);
        });
    }

    @Test
    @DisplayName("findAllLessThanAverage(); no order, positive numbers")
    public void findAllLessThanAverage1() {
        Assertions.assertArrayEquals(new int[]{1, 0, 2, 6, 1}, Main2_4.findAllLessThanAverage(new int[]{1, 0, 23, 2, 7, 6, 12, 1}));
    }

    @Test
    @DisplayName("findAllLessThanAverage(); negative and positive numbers")
    public void findAllLessThanAverage2() {
        Assertions.assertArrayEquals(new int[]{-24, -9}, Main2_4.findAllLessThanAverage(new int[]{1, 0, -24, 2, 3, -9, 9, 12}));
    }

    @Test
    @DisplayName("findAllLessThanAverage(); zero array")
    public void findAllLessThanAverage3() {
        Assertions.assertArrayEquals(new int[]{}, Main2_4.findAllLessThanAverage(new int[]{}));
    }

    @Test
    @DisplayName("findAllLessThanAverage(); null array")
    public void findAllLessThanAverage4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.findAllLessThanAverage(arr1);
        });
    }

    @Test
    @DisplayName("findAllLessThanAverage(); all numbers ones")
    public void findAllLessThanAverage5() {
        Assertions.assertArrayEquals(new int[]{}, Main2_4.findAllLessThanAverage(new int[]{1, 1, 1}));
    }


    @Test
    @DisplayName("findTwoMin(); no order, positive numbers")
    public void findTwoMin1() {
        Assertions.assertArrayEquals(new int[]{0, 1}, Main2_4.findTwoMin(new int[]{1, 0, 23, 2, 7, 6, 12, 1}));
    }

    @Test
    @DisplayName("findTwoMin(); negative and positive numbers")
    public void findTwoMin2() {
        Assertions.assertArrayEquals(new int[]{-24, -9}, Main2_4.findTwoMin(new int[]{1, 0, -24, 2, 3, -9, 9, 12}));
    }

    @Test
    @DisplayName("findTwoMin(); zero array")
    public void findTwoMin3() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Main2_4.findTwoMin(new int[]{});
        });
    }

    @Test
    @DisplayName("findTwoMin(); null array")
    public void findTwoMin4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.findTwoMin(arr1);
        });
    }

    @Test
    @DisplayName("findTwoMin(); all numbers ones")
    public void findTwoMin5() {
        Assertions.assertArrayEquals(new int[]{1, 1}, Main2_4.findTwoMin(new int[]{1, 1, 1}));
    }

    @Test
    @DisplayName("deleteAllBelongToInterval(); no order, positive numbers")
    public void deleteAllBelongToInterval1() {
        Assertions.assertArrayEquals(new int[]{0, 23, 12, 0, 0, 0, 0, 0}, Main2_4.deleteAllBelongToInterval(new int[]{1, 0, 23, 2, 7, 6, 12, 1}, 1, 10));
    }

    @Test
    @DisplayName("deleteAllBelongToInterval(); negative and positive numbers, no one in range")
    public void deleteAllBelongToInterval2() {
        Assertions.assertArrayEquals(new int[]{1, 0, -24, 2, 3, -9, 9, 12}, Main2_4.deleteAllBelongToInterval(new int[]{1, 0, -24, 2, 3, -9, 9, 12}, 15, 20));
    }

    @Test
    @DisplayName("deleteAllBelongToInterval(); zero array")
    public void deleteAllBelongToInterval3() {
        Assertions.assertArrayEquals(new int[]{}, Main2_4.deleteAllBelongToInterval(new int[]{}, 15, 20));
    }

    @Test
    @DisplayName("deleteAllBelongToInterval(); null array")
    public void deleteAllBelongToInterval4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.deleteAllBelongToInterval(arr1, 0, 10);
        });
    }

    @Test
    @DisplayName("deleteAllBelongToInterval(); all numbers ones, all in range")
    public void deleteAllBelongToInterval5() {
        Assertions.assertArrayEquals(new int[]{0, 0, 0}, Main2_4.deleteAllBelongToInterval(new int[]{1, 1, 1}, 1, 1));
    }

    @Test
    @DisplayName("addAllDigits(); no order, negative and positive numbers")
    public void addAllDigits1() {
        Assertions.assertEquals(34, Main2_4.addAllDigits(new int[]{1, 0, -25, 2, 3, -9, 9, 12}));
    }

    @Test
    @DisplayName("addAllDigits(); all negative numbers")
    public void addAllDigits2() {
        Assertions.assertEquals(6, Main2_4.addAllDigits(new int[]{-1, -2, -3}));
    }

    @Test
    @DisplayName("addAllDigits(); zero array")
    public void addAllDigits3() {
        Assertions.assertEquals(0, Main2_4.addAllDigits(new int[]{}));
    }

    @Test
    @DisplayName("addAllDigits(); null array")
    public void addAllDigits4() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            Main2_4.addAllDigits(arr1);
        });
    }
}
