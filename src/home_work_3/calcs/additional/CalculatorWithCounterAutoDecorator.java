package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private long countOperation;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public double add(double a, double b) {
        countOperation++;
        return calculator.add(a, b);
    }

    public double deduct(double a, double b) {
        countOperation++;
        return calculator.deduct(a, b);
    }

    public double multiply(double a, double b) {
        countOperation++;
        return calculator.multiply(a, b);
    }

    public double divide(double a, double b) {
        countOperation++;
        return calculator.divide(a, b);
    }

    public double raiseToAPower(double a, int power) {
        countOperation++;
        return calculator.raiseToAPower(a, power);
    }

    public double toAbsoluteValue(double a) {
        countOperation++;
        return calculator.toAbsoluteValue(a);
    }

    public double takeSquareRoot(double a) {
        countOperation++;
        return calculator.takeSquareRoot(a);
    }

    public long getCountOperation(){
        return countOperation;
    }

    public ICalculator getCalculator() {
        return  this.calculator;
    }
}
