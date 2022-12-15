package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class ModulusHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;

    public ModulusHandler(ICalculator calculator) {
        super("\\| *" + NUMBER_PATTERN + " *\\|");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        return calculator.toAbsoluteValue(Double.parseDouble(operand1));
    }

    @Override
    public int getPriority() {
        return 5;
    }
}
