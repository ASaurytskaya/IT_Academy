package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    static void printAllElements(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    static void printEverySecondElement(int[] array) {
        for(int i = 1; i < array.length; i +=2) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    static void printAllElementsReverse(int[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }
}
