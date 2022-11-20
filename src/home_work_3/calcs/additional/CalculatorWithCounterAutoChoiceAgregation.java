package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;
    private long countOperation;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator) {
        this.calculator1 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator) {
        this.calculator2 = calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator) {
        this.calculator3 = calculator;
    }

    public double add(double a, double b) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.add(a, b);
        } else if(calculator2 != null) {
            return calculator2.add(a, b);
        } else {
            return calculator3.add(a, b);
        }
    }

    public double deduct(double a, double b) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.deduct(a, b);
        } else if(calculator2 != null) {
            return calculator2.deduct(a, b);
        } else {
            return calculator3.deduct(a, b);
        }
    }

    public double multiply(double a, double b) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.multiply(a, b);
        } else if(calculator2 != null) {
            return calculator2.multiply(a, b);
        } else {
            return calculator3.multiply(a, b);
        }
    }

    public double divide(double a, double b) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.divide(a, b);
        } else if(calculator2 != null) {
            return calculator2.divide(a, b);
        } else {
            return calculator3.divide(a, b);
        }
    }

    public double raiseToAPower(double a, int power) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.raiseToAPower(a, power);
        } else if(calculator2 != null) {
            return calculator2.raiseToAPower(a, power);
        } else {
            return calculator3.raiseToAPower(a, power);
        }
    }

    public double toAbsoluteValue(double a) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.toAbsoluteValue(a);
        } else if(calculator2 != null) {
            return calculator2.toAbsoluteValue(a);
        } else {
            return calculator3.toAbsoluteValue(a);
        }
    }

    public double takeSquareRoot(double a) {
        countOperation++;
        if(calculator1 != null) {
            return calculator1.takeSquareRoot(a);
        } else if(calculator2 != null) {
            return calculator2.takeSquareRoot(a);
        } else {
            return calculator3.takeSquareRoot(a);
        }
    }

    public long getCountOperation(){
        return countOperation;
    }
}
