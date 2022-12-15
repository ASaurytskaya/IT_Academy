package home_work_5.tests;

import home_work_5.comparators.IntegerComparator;
import home_work_5.container.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DataContainerTest {
    DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, null, 9, 5});

    @Test
    @DisplayName("Add number")
    public void add1() {
        Assertions.assertEquals(2, container.add(0));
    }

    @Test
    @DisplayName("Add null")
    public void add2() {
        Assertions.assertEquals(-1, container.add(null));
    }

    @Test
    @DisplayName("Add numbers")
    public void add3() {
        container.add(0);
        Assertions.assertEquals(5, container.add(10));
    }

    @Test
    @DisplayName("Get number by index")
    public void get1() {
        Assertions.assertEquals(1, container.get(0));
    }

    @Test
    @DisplayName("Get number by index out of length")
    public void get2() {
        Assertions.assertNull(container.get(10));
    }

    @Test
    @DisplayName("Get items")
    public void getItems1() {
        Assertions.assertArrayEquals(new Integer[]{1, 2, null, 9, 5}, container.getItems());
    }

    @Test
    @DisplayName("Delete number by index")
    public void delete1() {
        Assertions.assertTrue(container.delete(2));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 9, 5}, container.getItems());
    }

    @Test
    @DisplayName("Delete number by index out of length")
    public void delete2() {
        Assertions.assertFalse(container.delete(9));
        Assertions.assertArrayEquals(new Integer[]{1, 2, null, 9, 5}, container.getItems());
    }

    @Test
    @DisplayName("Delete number by value")
    public void delete3() {
        Assertions.assertTrue(container.delete(Integer.valueOf(9)));
        Assertions.assertArrayEquals(new Integer[]{1, 2, null, 5}, container.getItems());
    }

    @Test
    @DisplayName("Delete null value")
    public void delete4() {
        Assertions.assertFalse(container.delete(null));
        Assertions.assertArrayEquals(new Integer[]{1, 2, null, 9, 5}, container.getItems());
    }

    @Test
    @DisplayName("Delete number by value, no such in container")
    public void delete5() {
        Assertions.assertFalse(container.delete(Integer.valueOf(0)));
        Assertions.assertArrayEquals(new Integer[]{1, 2, null, 9, 5}, container.getItems());
    }

    @Test
    @DisplayName("Sort")
    public void sort1() {
        container.sort(new IntegerComparator<>());
        Assertions.assertArrayEquals(new Integer[]{null, 1, 2, 5, 9}, container.getItems());
    }

    @Test
    @DisplayName("Static sort1")
    public void sort2() {
        DataContainer.sort(container);
        Assertions.assertArrayEquals(new Integer[]{null, 1, 2, 5, 9}, container.getItems());
    }

    @Test
    @DisplayName("Static sort2")
    public void sort3() {
        DataContainer.sort(container, new IntegerComparator<>());
        Assertions.assertArrayEquals(new Integer[]{null, 1, 2, 5, 9}, container.getItems());
    }

    @Test
    public void toString1() {
        Assertions.assertEquals("[1, 2, 9, 5]", container.toString());
    }

}
