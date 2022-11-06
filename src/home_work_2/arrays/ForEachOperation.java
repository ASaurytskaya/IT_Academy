package home_work_2.arrays;

import java.util.Arrays;

public class ForEachOperation implements IArraysOperation {
    static void printAllElements(int[] array) {
        for (int element : array) {
            System.out.print(element + " | ");
        }
        System.out.println();}

    static void printEverySecondElement(int[] array) {
        int counter = 0;
        for (int element : array) {
            if(counter % 2 != 0) {
                System.out.print(element + " | ");
            }
            counter++;
        }
        System.out.println();
    }

    static void printAllElementsReverse(int[] array) {
        int counter1 = 0;
        int counter2 = 0;
        int[] array2 = new int[array.length];
        for (int element1 : array) {
            for(int element2 : array) {
                if(counter1 == array2.length - 1 - counter2) {
                    System.out.print(element2 + " | ");
                    counter1 = 0;
                    break;
                }
                counter1++;
            }
            counter2++;
        }
        System.out.println();
    }
}
