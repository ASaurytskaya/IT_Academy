package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    public static String printAllElements(int[] array) {
        String result = "";
        if(array.length > 0) {
            int counter = 0;
            do{
                result += array[counter] + " | ";
                counter++;
            } while(counter < array.length);
        }
        System.out.println(result);
        return result;
    }

    public static String printEverySecondElement(int[] array) {
        String result = "";
        if(array.length > 1) {
            int counter = 1;
            do{
                result += array[counter] + " | ";
                counter += 2;
            } while(counter < array.length);
        }
        System.out.println(result);
        return result;
    }

    public static String printAllElementsReverse(int[] array) {
        String result = "";
        if(array.length > 0) {
            int counter = array.length - 1;
            do {
                result += array[counter] + " | ";
                counter--;
            } while (counter >= 0);
        }
        System.out.println(result);
        return result;
    }
}
