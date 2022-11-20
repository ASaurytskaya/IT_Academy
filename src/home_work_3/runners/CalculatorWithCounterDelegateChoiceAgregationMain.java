package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double result1 = calculator1.add(calculator1.add(4.1,calculator1.multiply(15, 7)), calculator1.raiseToAPower(calculator1.divide(28, 5),2));
        System.out.println(result1); //140.45999999999998
        System.out.println(calculator1.getCountOperation()); //5

        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        double result2 = calculator2.add(calculator2.add(4.1,calculator2.multiply(15, 7)), calculator2.raiseToAPower(calculator2.divide(28, 5),2));
        System.out.println(result2); //140.45999999999998
        System.out.println(calculator2.getCountOperation()); //5

        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        double result3 = calculator3.add(calculator3.add(4.1,calculator3.multiply(15, 7)), calculator3.raiseToAPower(calculator3.divide(28, 5),2));
        System.out.println(result3); //140.45999999999998
        System.out.println(calculator3.getCountOperation()); //5
    }
}
