package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());
        calculator.multiply(15, 7);
        calculator.save();
        double result1 = calculator.load();
        calculator.add(4.1, result1);
        calculator.save();
        double result2 = calculator.load();
        calculator.divide(28, 5);
        calculator.save();
        double result3 = calculator.load();
        calculator.raiseToAPower(result3,2);
        calculator.save();
        double result4 = calculator.load();
        calculator.add(result2, result4);
        calculator.save();
        double result = calculator.load();

        System.out.println(result); //140.45999999999998
    }
}
