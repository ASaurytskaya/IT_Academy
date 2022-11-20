package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
        if(power == 0) {
            return 1.0;
        }
        int count = 1;
        double result = a;
        while(count < power) {
            result *= a;
            count++;
        }
        return result;
    }

    public double toAbsoluteValue(double a) {
        if(a < 0) {
            return -a;
        }
        return a;
    }

    public double takeSquareRoot(double a) {
        return Math.sqrt(a);
    }
}
