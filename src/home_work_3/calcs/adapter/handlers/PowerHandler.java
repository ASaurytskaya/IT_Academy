package home_work_3.calcs.adapter.handlers;

import home_work_3.calcs.adapter.handlers.api.IHandler;
import home_work_3.calcs.api.ICalculator;

import java.util.regex.Matcher;

public class PowerHandler extends PatternHandler implements IHandler {

    private final ICalculator calculator;

    public PowerHandler(ICalculator calculator) {
        super(NUMBER_PATTERN + " *\\^ *" + "(\\d{1,})");
        this.calculator = calculator;
    }

    @Override
    protected double calc(Matcher matcher) {
        String operand1 = matcher.group(1);
        String operand2 = matcher.group(3);
        return calculator.raiseToAPower(Double.parseDouble(operand1), Integer.parseInt(operand2));
    }

    @Override
    public int getPriority() {
        return 6;
    }
}
