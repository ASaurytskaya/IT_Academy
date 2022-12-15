package home_work_3.calcs.adapter;

import home_work_3.calcs.adapter.handlers.*;
import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.PriorityQueue;

public class CalculatorAdapter {
    private final ICalculator calculator;
    private final PriorityQueue<IHandler> queueHandler = new PriorityQueue<>(
            (o1, o2) -> o2.getPriority() - o1.getPriority());

    public CalculatorAdapter() {
        this.calculator = new CalculatorWithMathExtends();
        this.queueHandler.add(new MinusHandler(this.calculator));
        this.queueHandler.add(new PlusHandler(this.calculator));
        this.queueHandler.add(new DivideHandler(this.calculator));
        this.queueHandler.add(new AddHandler(this.calculator));
        this.queueHandler.add(new PowerHandler(this.calculator));
        this.queueHandler.add(new ModulusHandler(this.calculator));
        this.queueHandler.add(new ConstantEHandler(this.calculator));
        this.queueHandler.add(new ConstantPIHandler(this.calculator));
    }

    public double calc(String expression) {
        for (IHandler handler : queueHandler) {
            System.out.println(handler);;
        }
        for (IHandler handler : queueHandler) {
            expression = handler.handle(expression);
        }

        return Double.parseDouble(expression);
    }
}
