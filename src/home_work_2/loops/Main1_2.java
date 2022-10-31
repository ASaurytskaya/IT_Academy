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
        char[] setOfNumbers = args[0].toCharArray();
        long result = 1L;
        for (int i = 0; i < setOfNumbers.length; i++) {
            int number = Integer.parseInt(String.valueOf(setOfNumbers[i]));
            System.out.print(number);
            if(i != setOfNumbers.length - 1) {
                System.out.print(" * ");
            }
            result = Math.multiplyExact(number, result);
        }
        System.out.print(" = " + result);
    }


}
