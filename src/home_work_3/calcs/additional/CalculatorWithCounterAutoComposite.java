package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
    private long countOperation;


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
}
