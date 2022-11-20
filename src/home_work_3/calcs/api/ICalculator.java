package home_work_3.calcs.api;

public interface ICalculator {
    double add(double a, double b);

    double deduct(double a, double b);

    double multiply(double a, double b);

    double divide(double a, double b);

    double raiseToAPower(double a, int power);

    double toAbsoluteValue(double a);

    double takeSquareRoot(double a);
}
