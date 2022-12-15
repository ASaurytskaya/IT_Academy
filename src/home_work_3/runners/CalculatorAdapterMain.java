package home_work_3.runners;

import home_work_3.calcs.adapter.CalculatorAdapter;

public class CalculatorAdapterMain {
    public static void main(String[] args) {
        CalculatorAdapter calcAdapter = new CalculatorAdapter();
        double result = calcAdapter.calc("5 + 8 * 2 * 5 / 2 + |-5| - PI^ 2" );

        System.out.println(result);

    }
}
