package home_work_2.loops;

public class Main1_2 {
    public static void main(String[] args) {
        if(!args[0].matches("[0-9]+")) {
            if(args[0].matches("[0-9]+\\.[0-9]+")) {
                System.out.println("Ошибка: введено не целое число.");
            } else {
                System.out.println("Ошибка: введено не число.");
            }
            return;
        }
        int lastNumber = Integer.parseInt(args[0]);
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
