package home_work_4.home_work_3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoChoiceAgregationTest {
    private CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
    private CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
    private CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());


    @Test
    public void add1() {
        Assertions.assertEquals(2, calculator1.add(1, 1));
        Assertions.assertEquals(2, calculator2.add(1, 1));
        Assertions.assertEquals(2, calculator3.add(1, 1));
    }

    @Test
    public void add2() {
        Assertions.assertEquals(-16, calculator1.add(-8, -8));
        Assertions.assertEquals(-16, calculator2.add(-8, -8));
        Assertions.assertEquals(-16, calculator3.add(-8, -8));
    }

    @Test
    public void deduct1() {
        Assertions.assertEquals(0, calculator1.deduct(1, 1));
        Assertions.assertEquals(0, calculator2.deduct(1, 1));
        Assertions.assertEquals(0, calculator3.deduct(1, 1));
    }

    @Test
    public void deduct2() {
        Assertions.assertEquals(0, calculator1.deduct(-8, -8));
        Assertions.assertEquals(0, calculator2.deduct(-8, -8));
        Assertions.assertEquals(0, calculator3.deduct(-8, -8));
    }

    @Test
    public void multiply1() {
        Assertions.assertEquals(1, calculator1.multiply(1, 1));
        Assertions.assertEquals(1, calculator2.multiply(1, 1));
        Assertions.assertEquals(1, calculator3.multiply(1, 1));
    }

    @Test
    public void multiply2() {
        Assertions.assertEquals(64, calculator1.multiply(-8, -8));
        Assertions.assertEquals(64, calculator2.multiply(-8, -8));
        Assertions.assertEquals(64, calculator3.multiply(-8, -8));
    }

    @Test
    public void divide1() {
        Assertions.assertEquals(1, calculator1.divide(1, 1));
        Assertions.assertEquals(1, calculator2.divide(1, 1));
        Assertions.assertEquals(1, calculator3.divide(1, 1));
    }

    @Test
    public void divide2() {
        Assertions.assertEquals(1, calculator1.divide(-8, -8));
        Assertions.assertEquals(1, calculator2.divide(-8, -8));
        Assertions.assertEquals(1, calculator3.divide(-8, -8));
    }

    @Test
    public void raiseToAPower1() {
        Assertions.assertEquals(1, calculator1.raiseToAPower(2, 0));
        Assertions.assertEquals(1, calculator2.raiseToAPower(2, 0));
        Assertions.assertEquals(1, calculator3.raiseToAPower(2, 0));
    }

    @Test
    public void raiseToAPower2() {
        Assertions.assertEquals(8, calculator1.raiseToAPower(2, 3));
        Assertions.assertEquals(8, calculator2.raiseToAPower(2, 3));
        Assertions.assertEquals(8, calculator3.raiseToAPower(2, 3));
    }

    @Test
    public void takeSquareRoot1() {
        Assertions.assertEquals(4, calculator1.takeSquareRoot(16));
        Assertions.assertEquals(4, calculator2.takeSquareRoot(16));
        Assertions.assertEquals(4, calculator3.takeSquareRoot(16));
    }

    @Test
    public void takeSquareRoot2() {
        Assertions.assertEquals(0, calculator1.takeSquareRoot(0));
        Assertions.assertEquals(0, calculator2.takeSquareRoot(0));
        Assertions.assertEquals(0, calculator3.takeSquareRoot(0));
    }

    @Test
    public void toAbsoluteValue1() {
        Assertions.assertEquals(4, calculator1.toAbsoluteValue(4));
        Assertions.assertEquals(4, calculator2.toAbsoluteValue(4));
        Assertions.assertEquals(4, calculator3.toAbsoluteValue(4));
    }

    @Test
    public void toAbsoluteValue2() {
        Assertions.assertEquals(4, calculator1.toAbsoluteValue(-4));
        Assertions.assertEquals(4, calculator2.toAbsoluteValue(-4));
        Assertions.assertEquals(4, calculator3.toAbsoluteValue(-4));
    }

    @Test
    public void getCount1() {
        double result = calculator1.add(calculator1.add(4.1,calculator1.multiply(15, 7)),
                calculator1.raiseToAPower(calculator1.divide(28, 5),2));
        Assertions.assertEquals(5, calculator1.getCountOperation());
    }

    @Test
    public void getCount2() {
        double result = calculator2.add(calculator2.add(4.1,calculator2.multiply(15, 7)),
                calculator2.raiseToAPower(calculator2.divide(28, 5),2));
        Assertions.assertEquals(5, calculator2.getCountOperation());
    }

    @Test
    public void getCount3() {
        double result = calculator3.add(calculator3.add(4.1,calculator3.multiply(15, 7)),
                calculator3.raiseToAPower(calculator3.divide(28, 5),2));
        Assertions.assertEquals(5, calculator3.getCountOperation());
    }
}
