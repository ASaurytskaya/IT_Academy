package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        double result1 = calculator.multiply(15, 7);
        calculator.incrementCountOperation();
        double result2 = calculator.add(4.1, result1);
        calculator.incrementCountOperation();
        double result3 = calculator.divide(28, 5);
        calculator.incrementCountOperation();
        double result4 = calculator.raiseToAPower(result3,2);
        calculator.incrementCountOperation();
        double result = calculator.add(result2, result4);
        calculator.incrementCountOperation();
        System.out.println(result); //140.45999999999998
        System.out.println(calculator.getCountOperation()); //5

    }
}
