package home_work_4.home_work_2.loops;

import home_work_2.loops.Main1_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main1_2Test {
    @Test
    @DisplayName("Normal")
    public void printNumbersMultiplication1() {
        Assertions.assertEquals(120, Main1_2.printNumbersMultiplication(12345));
    }

    @Test
    @DisplayName("Normal")
    public void printNumbersMultiplication2() {
        Assertions.assertEquals(10080, Main1_2.printNumbersMultiplication(181232375));
    }

    @Test
    @DisplayName("Max integer")
    public void printNumbersMultiplication3(){
        Assertions.assertEquals(903168, Main1_2.printNumbersMultiplication(2147483647));
    }

    @Test
    @DisplayName("Number with zero")
    public void printNumbersMultiplication4(){
        Assertions.assertEquals(0, Main1_2.printNumbersMultiplication(500));
    }
}
