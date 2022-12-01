package home_work_4.home_work_2.loops;

import home_work_2.loops.Main1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Main1_5Test {
    @Test
    public void findMaxNumber1() {
        Assertions.assertEquals(9, Main1_5.findMaxNumber(1234567890));
    }

    @Test
    public void findMaxNumber2() {
        Assertions.assertEquals(1, Main1_5.findMaxNumber(11111));
    }

    @RepeatedTest(100)
    public void generateRandomNumbers1() {
        Assertions.assertNotEquals(0, Main1_5.generateRandomNumbers(100));
    }

    @Test
    public void generateRandomNumbers2() {
        Assertions.assertEquals(0, Main1_5.generateRandomNumbers(0));
    }

    @Test
    public void findEvenNumbers1() {
        Assertions.assertEquals(5, Main1_5.findEvenNumbers("1234567890"));
    }

    @Test
    public void findEvenNumbers2() {
        Assertions.assertEquals(0, Main1_5.findEvenNumbers("1133557799"));
    }

    @Test
    public void findOddNumbers1() {
        Assertions.assertEquals(5, Main1_5.findOddNumbers("1234567890"));
    }

    @Test
    public void calculateFibonacci1() {
        Assertions.assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Main1_5.calculateFibonacci(10));
    }

    @Test
    public void calculateFibonacci2() {
        Assertions.assertArrayEquals(new int[0], Main1_5.calculateFibonacci(0));
    }

    @Test
    public void createSeriesOfNumbers1() {
        Assertions.assertEquals("0 2 4 6 8 10 12 ", Main1_5.createSeriesOfNumbers(0, 12, 2));
    }

    @Test
    public void createSeriesOfNumbers2() {
        Assertions.assertEquals("Неверно указан диапазон чисел.", Main1_5.createSeriesOfNumbers(0, 0, 0));
    }

    @Test
    public void createSeriesOfNumbers3() {
        Assertions.assertEquals("Неверно указан шаг (0). Невозможно заполнить диапазон.", Main1_5.createSeriesOfNumbers(0, 1, 0));
    }

    @Test
    public void revertNumber1() {
        Assertions.assertEquals(987654321, Main1_5.revertNumber(123456789));
    }

    @Test
    public void revertNumber2() {
        Assertions.assertEquals(1111, Main1_5.revertNumber(1111));
    }

    @Test
    public void revertNumber3() {
        Assertions.assertEquals(-22336, Main1_5.revertNumber(-63322));
    }
}
