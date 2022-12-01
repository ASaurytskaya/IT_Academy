package home_work_2.loops;

public class Main1_2 {

    public static long printNumbersMultiplication(int number) {
        char[] setOfNumbers = (String.valueOf(number)).toCharArray();
        long result = 1L;
        for (int i = 0; i < setOfNumbers.length; i++) {
            int digit = Integer.parseInt(String.valueOf(setOfNumbers[i]));
            System.out.print(digit);
            if(i != setOfNumbers.length - 1) {
                System.out.print(" * ");
            }
            result = Math.multiplyExact(digit, result);
        }
        System.out.println(" = " + result);
        return result;
    }

}
