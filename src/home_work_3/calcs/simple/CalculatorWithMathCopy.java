package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double add(double a, double b) {
        return (a + b);
    }

    public double deduct(double a, double b) {
        return (a - b);
    }

    public double multiply(double a, double b) {
        return (a * b);
    }

    public double divide(double a, double b) {
        return (a / b);
    }

    public double raiseToAPower(double a, int power) {
        return Math.pow(a, power);
    }

    public double toAbsoluteValue(double a) {
        return Math.abs(a);
    }

    public double takeSquareRoot(double a) {
        return Math.sqrt(a);
    }
}
