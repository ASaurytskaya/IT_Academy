package home_work_2.loops;

public class Main1_5 {

    public static int findMaxNumber (int number) {
        char[] numbers = String.valueOf(number).toCharArray();
        int max = Integer.parseInt(String.valueOf(numbers[0]));
        for (int i = 1; i < numbers.length; i++) {
            int a = Integer.parseInt(String.valueOf(numbers[i]));
            if(a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int generateRandomNumbers(int sampleSize) {
        int counter = 0;
        for (int i = 0; i < sampleSize; i++) {
            int a = (int) (Math.random() * 73);
            if(a % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int findEvenNumbers(String number) {
        int counter = 0;
        char[] numbers = number.toCharArray();
        for (char c : numbers) {
            int a = Integer.parseInt(String.valueOf(c));
            if (a % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int findOddNumbers(String number) {
        int counter = 0;
        char[] numbers = number.toCharArray();
        for (char c : numbers) {
            int a = Integer.parseInt(String.valueOf(c));
            if (a % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] calculateFibonacci(int size) {
        if(size == 0) {
            return new int[0];
        }
        int[] array = new int[size];
        array[0] = 0;
        if(size == 1) {
            return array;
        }
        array[1] = 1;
        for(int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public static String createSeriesOfNumbers(int min, int max, int step) {
        if(min >= max) {
            return "Неверно указан диапазон чисел.";
        }
        if(step == 0) {
            return "Неверно указан шаг (0). Невозможно заполнить диапазон.";
        }
        String result = "";
        for(int i = min; i <= max; i += step) {
            result += i + " ";
        }
        return result;
    }

    public static int revertNumber(int number) {
        boolean isNegative = false;
        char[] arrayForward = String.valueOf(number).toCharArray();
        String numberRev = "";
        for (char c : arrayForward) {
            if(c == '-') {
                isNegative = true;
                continue;
            }
            numberRev = Integer.parseInt(String.valueOf(c)) + numberRev;
        }
        int result = Integer.parseInt(numberRev);
        if(isNegative) {
            return -result;
        }
        return result;
    }
}
