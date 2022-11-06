package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    static void printAllElements(int[] array) {
        int counter = 0;
        do{
            System.out.print(array[counter] + " | ");
            counter++;
        } while(counter < array.length);
        System.out.println();
    }

    static void printEverySecondElement(int[] array) {
        int counter = 1;
        do{
            System.out.print(array[counter] + " | ");
            counter += 2;
        } while(counter < array.length);
        System.out.println();
    }

    static void printAllElementsReverse(int[] array) {
        int counter = array.length - 1;
        do{
            System.out.print(array[counter] + " | ");
            counter--;
        } while(counter >= 0);
        System.out.println();
    }
}
