package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

public class ArraysIteration {
    public static void main(String[] args) throws Exception{
        printAllElements(ArraysUtils.arrayFromConsole());
        printEverySecondElement(ArraysUtils.arrayFromConsole());
        printAllElementsReverse(ArraysUtils.arrayFromConsole());
    }

    public static void printAllElements(int[] array) {
        int counter1 = 0;
        do{
            System.out.print(array[counter1] + " | ");
            counter1++;
        } while(counter1 < array.length);
        System.out.println();

        int counter2 = 0;
        while(counter2 < array.length) {
            System.out.print(array[counter2] + " | ");
            counter2++;
        }
        System.out.println();

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();

        for (int element : array) {
            System.out.print(element + " | ");
        }
        System.out.println();
    }

    public static void printEverySecondElement(int[] array) {
        int counter1 = 1;
        do{
            System.out.print(array[counter1] + " | ");
            counter1 += 2;
        } while(counter1 < array.length);
        System.out.println();

        int counter2 = 1;
        while(counter2 < array.length) {
            System.out.print(array[counter2] + " | ");
            counter2 +=2;
        }
        System.out.println();

        for(int i = 1; i < array.length; i +=2) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();

        int counter3 = 0;
        for (int element : array) {
            if(counter3 % 2 != 0) {
                System.out.print(element + " | ");
            }
            counter3++;
        }
        System.out.println();
    }

    public static void printAllElementsReverse(int[] array) {
        int counter1 = array.length - 1;
        do{
            System.out.print(array[counter1] + " | ");
            counter1--;
        } while(counter1 >= 0);
        System.out.println();

        int counter2 = array.length - 1;
        while(counter2 >= 0) {
            System.out.print(array[counter2] + " | ");
            counter2--;
        }
        System.out.println();

        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();

        int counter3 = 0;
        int counter4 = 0;
        int[] array2 = Arrays.copyOf(array, array.length);
        for (int element1 : array) {
            for(int element2 : array) {
                if(counter3 == array2.length - 1 - counter4) {
                    System.out.print(element2 + " | ");
                    counter3 = 0;
                    break;
                }
                counter3++;
            }
            counter4++;
        }
        System.out.println();
    }
}
