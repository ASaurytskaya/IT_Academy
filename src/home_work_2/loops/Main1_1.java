package home_work_2.loops;

public class Main1_1 {

    public static long printFactorialLoop(int number) {
        long result = 1L;
        for(int i = 1; i <= number; i++) {
            System.out.print(i);
            if(i != number) {
                System.out.print(" * ");
            }
            result = Math.multiplyExact(i, result);
        }
        System.out.println(" = " + result);
        return  result;
    }

    public static long factorial(int number) {
        long result;
        if(number == 1) {
            return 1;
        } else {
            result = Math.multiplyExact(factorial(number - 1), number);
            return result;
        }
    }
}
