package additional.test1512.tests.task_1;

import additional.test1512.task_1.Main1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main1Test {
    @Test
    public void compareNumbers1() {
        Assertions.assertEquals(2, Main1.compareNumbers(1,2,3));
    }

    @Test
    public void compareNumbers2() {
        Assertions.assertEquals(8, Main1.compareNumbers(5,2,3));
    }

    @Test
    public void calculateMean1() {
        Assertions.assertEquals(2, Main1.calculateMean(1,2,3));
    }

    @Test
    public void calculateMean2() {
        Assertions.assertEquals(0, Main1.calculateMean(0,0,0));
    }

}
