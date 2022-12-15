package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class ConstantEHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;

    public ConstantEHandler(ICalculator calculator) {
        super("E");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        return Math.E;
    }

    @Override
    public int getPriority() {
        return 7;
    }
}
