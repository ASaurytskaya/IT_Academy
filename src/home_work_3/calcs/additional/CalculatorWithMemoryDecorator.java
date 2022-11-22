package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private ICalculator calculator;
    private double lastResult = 0;
    private double result = 0;

    public CalculatorWithMemoryDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double add(double a, double b) {
        return result = calculator.add(a, b);
    }

    public double deduct(double a, double b) {
        return result = calculator.deduct(a, b);
    }

    public double multiply(double a, double b) {
        return result = calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        return result = calculator.divide(a, b);
    }

    public double raiseToAPower(double a, int power) {
        return result = calculator.raiseToAPower(a, power);
    }

    public double toAbsoluteValue(double a) {
        return result = calculator.toAbsoluteValue(a);
    }

    public double takeSquareRoot(double a) {
        return result = calculator.takeSquareRoot(a);
    }

    public void save() {
        lastResult = result;
    }

    public double load() {
        double a = lastResult;
        lastResult = 0;
        return a;
    }

    public ICalculator getCalculator() {
        return  this.calculator;
    }
}
