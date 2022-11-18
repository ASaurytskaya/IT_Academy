package home_work_3.calcs.simple;

public class CalculatorWithMathCopy {
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
