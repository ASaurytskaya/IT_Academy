package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    static void printAllElements(int[] array) {
        int counter = 0;
        while(counter < array.length) {
            System.out.print(array[counter] + " | ");
            counter++;
        }
        System.out.println();
    }

    static void printEverySecondElement(int[] array) {
        int counter = 1;
        while(counter < array.length) {
            System.out.print(array[counter] + " | ");
            counter +=2;
        }
        System.out.println();
    }

    static void printAllElementsReverse(int[] array) {
        int counter = array.length - 1;
        while(counter >= 0) {
            System.out.print(array[counter] + " | ");
            counter--;
        }
        System.out.println();
    }
}
