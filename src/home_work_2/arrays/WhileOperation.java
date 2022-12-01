package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    public static String printAllElements(int[] array) {
        String result = "";
        if(array.length > 0) {
            int counter = 0;
            while (counter < array.length) {
                result += array[counter] + " | ";
                counter++;
            }
        }
        System.out.println(result);
        return  result;
    }

    public static String printEverySecondElement(int[] array) {
        String result = "";
        if(array.length > 1) {
            int counter = 1;
            while (counter < array.length) {
                result += array[counter] + " | ";
                counter += 2;
            }
        }
        System.out.println(result);
        return  result;
    }

    public static String printAllElementsReverse(int[] array) {
        String result = "";
        if(array.length > 0) {
            int counter = array.length - 1;
            while (counter >= 0) {
                result += array[counter] + " | ";
                counter--;
            }
        }
        System.out.println(result);
        return result;
    }
}
