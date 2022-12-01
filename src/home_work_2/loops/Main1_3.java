package home_work_2.loops;

public class Main1_3 {

    public static double exponentiate(double base, int power) {
        double result = base;
        if(power == 0) {
            return 1;
        }
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }

    public static String printExponential(double base, int power,double result) {
        return String.format("%s ^ %d = %s", String.valueOf(base), power, String.valueOf(result));
    }
}
