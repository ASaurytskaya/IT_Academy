package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    public static String printAllElements(int[] array) {
        String result = "";
        if(array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                result += array[i] + " | ";
            }
        }
        System.out.println(result);
        return result;
    }

    public static String printEverySecondElement(int[] array) {
        String result = "";
        if(array.length > 1) {
            for (int i = 1; i < array.length; i += 2) {
                result += array[i] + " | ";
            }
        }
        System.out.println(result);
        return  result;
    }

    public static String printAllElementsReverse(int[] array) {
        String result = "";
        if(array.length > 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                result += array[i] + " | ";
            }
        }
        System.out.println(result);
        return result;
    }
}
