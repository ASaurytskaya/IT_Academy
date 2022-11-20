package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();
        double result = calculator.add(calculator.add(4.1,calculator.multiply(15, 7)), calculator.raiseToAPower(calculator.divide(28, 5),2));
        System.out.println(result); //140.45999999999998
        System.out.println(calculator.getCountOperation()); //5
    }
}
