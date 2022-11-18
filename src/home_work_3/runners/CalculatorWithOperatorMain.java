package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculator = new CalculatorWithOperator();
        double result = calculator.add(calculator.add(4.1,calculator.multiply(15, 7)), calculator.raiseToAPower(calculator.divide(28, 5),2));
        System.out.println(result); //140.45999999999998
    }
}
