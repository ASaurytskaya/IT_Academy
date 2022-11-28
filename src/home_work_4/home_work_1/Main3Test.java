package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main3Test {
    @Test
    public void calculateGrowthRate1() {
        double result = home_work_1.Main3.calculateGrowthRate(10,100,2);
        Assertions.assertEquals((1 / Math.log10(2) / 2), result);
    }

    @Test
    public void calculateGain1(){
        double result = home_work_1.Main3.calculateGain(1000, 1, 1);
        Assertions.assertEquals(2000, result);
    }
}
