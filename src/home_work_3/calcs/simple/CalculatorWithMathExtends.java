package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    @Override
    public double raiseToAPower(double a, int power) {
        return Math.pow(a, power);
    }

    @Override
    public double toAbsoluteValue(double a) {
        return Math.abs(a);
    }

    @Override
    public double takeSquareRoot(double a) {
        return Math.sqrt(a);
    }
}
