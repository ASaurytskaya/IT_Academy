package home_work_2.loops;

public class Main1_1 {
    public static void main(String[] args) {
        if(!args[0].matches("[0-9]+")) {
            if(args[0].matches("[0-9]+\\.[0-9]+")) {
                System.out.println("Ошибка: введено не целое число.");
            } else if(args[0].matches("[-0-9]+\\.[0-9]+") || args[0].matches("-[0-9]+")) {
                System.out.println("Ошибка: введено отрицательное число.");
            } else {
                System.out.println("Ошибка: введено не число.");
            }
            return;
        }
        int lastNumber = Integer.parseInt(args[0]);
        /*
         * Решение с использованием цикла.
         */
        long result = 1L;
        for(int i = 1; i <= lastNumber; i++) {
            System.out.print(i);
            if(i != lastNumber) {
                System.out.print(" * ");
            }
            result = Math.multiplyExact(i, result);
        }
        System.out.println(" = " + result);
        /*
         * Решение с использованием рекурсивного метода.
         */
        System.out.println(factorial(lastNumber));
    }

    static long factorial(int number) {
        long result;
        if(number == 1) {
            return 1;
        } else {
            result = Math.multiplyExact(factorial(number - 1), number);
            return result;
        }
    }
}
