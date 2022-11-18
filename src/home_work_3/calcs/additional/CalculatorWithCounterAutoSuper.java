package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long countOperation = 0;

    @Override
    public double add(double a, double b) {
        countOperation++;
        return super.add(a, b);
    }

    @Override
    public double deduct(double a, double b) {
        countOperation++;
        return super.deduct(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        countOperation++;
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        countOperation++;
        return super.divide(a, b);
    }

    @Override
    public double raiseToAPower(double a, int power) {
        countOperation++;
        return super.raiseToAPower(a, power);
    }

    @Override
    public double toAbsoluteValue(double a) {
        countOperation++;
        return super.toAbsoluteValue(a);
    }

    @Override
    public double takeSquareRoot(double a) {
        countOperation++;
        return super.takeSquareRoot(a);
    }

    public long getCountOperation(){
        return countOperation;
    }
}
