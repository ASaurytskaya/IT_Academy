package home_work_4.home_work_2.utils;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {

    @Test
    @DisplayName("Direct order, bubble sort")
    public void sort1() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.sort(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
    }

    @Test
    @DisplayName("Repeated numbers, bubble sort")
    public void sort2() {
        int[] arr1 = new int[]{1, 1, 1, 1};
        SortsUtils.sort(arr1);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr1);
    }

    @Test
    @DisplayName("Reverse order, bubble sort")
    public void sort3() {
        int[] arr1 = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.sort(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
    }

    @Test
    @DisplayName("No order, bubble sort")
    public void sort4() {
        int[] arr1 = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.sort(arr1);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr1);
    }

    @Test
    @DisplayName("Empty array, bubble sort")
    public void sort5() {
        int[] arr1 = new int[]{};
        SortsUtils.sort(arr1);
        Assertions.assertArrayEquals(new int[]{}, arr1);
    }

    @Test
    @DisplayName("Null array, bubble sort")
    public void sort6() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            SortsUtils.sort(arr1);
        });
    }

    @Test
    @DisplayName("Direct order, shake sort")
    public void sort11() {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
    }

    @Test
    @DisplayName("Repeated numbers, shake sort")
    public void sort12() {
        int[] arr1 = new int[]{1, 1, 1, 1};
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr1);
    }

    @Test
    @DisplayName("Reverse order, shake sort")
    public void sort13() {
        int[] arr1 = new int[]{6, 5, 4, 3, 2, 1};
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
    }

    @Test
    @DisplayName("No order, shake sort")
    public void sort14() {
        int[] arr1 = new int[]{9, 1, 5, 99, 9, 9};
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr1);
    }

    @Test
    @DisplayName("Empty array, shake sort")
    public void sort15() {
        int[] arr1 = new int[]{};
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{}, arr1);
    }

    @Test
    @DisplayName("Null array, shake sort")
    public void sort16() {
        int[] arr1 = null;
        Assertions.assertThrows(NullPointerException.class, () -> {
            SortsUtils.shake(arr1);
        });
    }
}