package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();
        double result = calculator.add(calculator.add(4.1,calculator.multiply(15, 7)), calculator.raiseToAPower(calculator.divide(28, 5),2));
        System.out.println(result); //140.45999999999998
        System.out.println(calculator.getCountOperation()); //5
    }
}
