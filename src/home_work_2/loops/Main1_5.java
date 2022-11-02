package home_work_2.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1_5 {
    public static void main(String[] args) {
        String n1 = "";
        int min = 0, max = 0, step = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите натуральное целое число:");
            n1 = NumberEntry.enterNaturalInteger(reader);

            System.out.println("Введите минимальное натуральное число из диапазона:");
            String s1  = NumberEntry.enterNaturalInteger(reader);
            min = Integer.parseInt(s1);

            System.out.println("Введите максимальное натуральное число из диапазона:");
            String s2  = NumberEntry.enterNaturalInteger(reader);
            max = Integer.parseInt(s2);

            System.out.println("Введите размер шага:");
            String s3  = NumberEntry.enterNaturalInteger(reader);
            step = Integer.parseInt(s3);
        } catch(Exception ignore) {}
        System.out.println("Наибольшая цифра в числе " + n1 + " - " + findMaxNumber(n1));

        int sampleSize = 1000;
        System.out.println("Количество четных чисел в " + sampleSize + " случайно сгенерированных - " + generateRandomNumbers(sampleSize));

        System.out.println("В числе " + n1 + " четных цифр - " + findEvenNumbers(n1) + " и нечетных цифр - " + findOddNumbers(n1));

        int seriesLength = 10;
        printFibonacci(seriesLength);
        System.out.println();

        printSeriesOfNumbers(min, max, step);
        System.out.println();

        System.out.println("Число " + n1 + " обратно по порядку входящих в него цифр числу " + revertNumber(Integer.parseInt(n1)));
    }

    public static int findMaxNumber (String number) {
        char[] numbers = number.toCharArray();
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

    public static void printFibonacci(int size) {
        int[] array = new int[size];
        array[0] = 0;
        array[1] = 1;
        System.out.print("0 1 ");
        for(int i = 2; i < size; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
        }
    }

    public static void printSeriesOfNumbers(int min, int max, int step) {
        if(min >= max) {
            System.out.println("Неверно указан диапазон чисел.");
            return;
        }
        if(step == 0) {
            System.out.println("Неверно указан шаг (0). Невозможно заполнить диапазон.");
            return;
        }
        for(int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
    }

    public static int revertNumber(int number) {
        char[] arrayForward = String.valueOf(number).toCharArray();
        String numberRev = "";
        for (char c : arrayForward) {
            numberRev = Integer.parseInt(String.valueOf(c)) + numberRev;
        }
        return Integer.parseInt(numberRev);
    }
}
