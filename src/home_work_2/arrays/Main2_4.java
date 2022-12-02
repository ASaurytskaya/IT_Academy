package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class Main2_4 {
    public static void main(String[] args) {
        int[] array = ArraysUtils.arrayRandom(50, 100);
        for (int n: array
             ) {
            System.out.print(n + " | ");
        }
        System.out.println();

        System.out.println(addPositiveIntegers(array));

        System.out.println(findMaxWithEvenIndex(array));

        int[] array2 = findAllLessThanAverage(array);
        for(int i : array2) {
            System.out.print(i + " | ");
        }
        System.out.println();

        int[] array3 = findTwoMin(array);
        for(int i : array3) {
            System.out.print(i + " | ");
        }
        System.out.println();

        int[] array4 = deleteAllBelongToInterval(array, 5, 25);
        for(int i : array4) {
            System.out.print(i + " | ");
        }
        System.out.println();

        System.out.println(addAllDigits(array));
    }

    public static long addPositiveIntegers(int[] array)  {
        long sum = 0;
        for (int number : array) {
            if(number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int findMaxWithEvenIndex(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] findAllLessThanAverage(int[] array) {
        int[] array2 = new int[array.length];
        long sum = 0;
        for(int number : array) {
            sum += number;
        }
        double average = sum / (double) array.length;
        int counter = 0;
        for(int number : array) {
            if(number < average) {
                array2[counter] = number;
                counter++;
            }
        }
        int[] result = Arrays.copyOfRange(array2, 0, counter);
        return result;
    }

    public static int[] findTwoMin(int[] array) {
        int[] result = new int[2];
        int index = 0;
        int min1 = array[0];
        int min2 = min1;
        for(int i = 1; i < array.length; i++) {
            if(min1 > array[i]) {
                min1 = array[i];
                index = i;
            }
        }
        for(int i = 0; i < array.length; i++) {
            if(i == index) {
                continue;
            }
            if(min2 > array[i]) {
                min2 = array[i];
            }
        }
        result[0] = min1;
        result[1] = min2;
        return result;
    }

    public static int[] deleteAllBelongToInterval(int[] array, int start, int end) {
        int[] result = new int[array.length];
        int counter = 0;

        for(int number : array) {
            if(number < start || number > end) {
                result[counter] = number;
                counter++;
            }
        }
        return result;
    }

    public static long addAllDigits(int[] array) {
        long sum = 0;
        for(int number : array) {
            String n = "" + Math.abs(number);
            char[] set = n.toCharArray();
            for(char c : set) {
                int i = Integer.parseInt(String.valueOf(c));
                sum += i;
            }
        }
        return sum;
    }
}
