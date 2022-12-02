package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoSuperTest {
    private CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

    @Test
    public void add1() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void add2() {
        Assertions.assertEquals(-16, calculator.add(-8, -8));
    }

    @Test
    public void deduct1() {
        Assertions.assertEquals(0, calculator.deduct(1, 1));
    }

    @Test
    public void deduct2() {
        Assertions.assertEquals(0, calculator.deduct(-8, -8));
    }

    @Test
    public void multiply1() {
        Assertions.assertEquals(1, calculator.multiply(1, 1));
    }

    @Test
    public void multiply2() {
        Assertions.assertEquals(64, calculator.multiply(-8, -8));
    }

    @Test
    public void divide1() {
        Assertions.assertEquals(1, calculator.divide(1, 1));
    }

    @Test
    public void divide2() {
        Assertions.assertEquals(1, calculator.divide(-8, -8));
    }

    @Test
    public void raiseToAPower1() {
        Assertions.assertEquals(1, calculator.raiseToAPower(2, 0));
    }

    @Test
    public void raiseToAPower2() {
        Assertions.assertEquals(8, calculator.raiseToAPower(2, 3));
    }

    @Test
    public void takeSquareRoot1() {
        Assertions.assertEquals(4, calculator.takeSquareRoot(16));
    }

    @Test
    public void takeSquareRoot2() {
        Assertions.assertEquals(0, calculator.takeSquareRoot(0));
    }

    @Test
    public void toAbsoluteValue1() {
        Assertions.assertEquals(4, calculator.toAbsoluteValue(4));
    }

    @Test
    public void toAbsoluteValue2() {
        Assertions.assertEquals(4, calculator.toAbsoluteValue(-4));
    }

    @Test
    public void getCount() {
        double result = calculator.add(calculator.add(4.1,calculator.multiply(15, 7)),
                calculator.raiseToAPower(calculator.divide(28, 5),2));
        Assertions.assertEquals(5, calculator.getCountOperation());
    }
}
