package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    public static String printAllElements(int[] array) {
        String result = "";
        if(array.length > 0) {
            for (int element : array) {
                result += element + " | ";
            }
        }
        System.out.println(result);
        return result;
    }

    public static String printEverySecondElement(int[] array) {
        String result = "";
        if(array.length > 1) {
            int counter = 0;
            for (int element : array) {
                if (counter % 2 != 0) {
                    result += element + " | ";
                }
                counter++;
            }
        }
        System.out.println(result);
        return result;
    }

    public static String printAllElementsReverse(int[] array) {
        String result = "";
        if(array.length > 0) {
            int counter = array.length - 1;
            for (int element : array) {
                result += array[counter] + " | ";
                counter--;
            }
        }
        System.out.println(result);
        return result;
    }
}
