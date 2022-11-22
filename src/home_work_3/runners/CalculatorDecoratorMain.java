package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calculator.add(calculator.add(4.1, calculator.multiply(15, 7)), calculator.raiseToAPower(calculator.divide(28, 5), 2));
        System.out.println(result); //140.45999999999998
        System.out.println(((CalculatorWithCounterAutoDecorator) calculator).getCountOperation()); //5
        ICalculator calc;
        if ((calc  = ((CalculatorWithCounterAutoDecorator) calculator).getCalculator()) instanceof CalculatorWithMemoryDecorator) {
            ((CalculatorWithMemoryDecorator) calc).save();
            System.out.println(((CalculatorWithMemoryDecorator) calc).load());
        }
    }
}
