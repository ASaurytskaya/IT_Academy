package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Main2_3 {
    public static void main(String[] args) throws Exception{
        int[] array = ArraysUtils.arrayFromConsole();
        DoWhileOperation.printAllElements(array);
        DoWhileOperation.printEverySecondElement(array);
        DoWhileOperation.printAllElementsReverse(array);
        System.out.println();
        WhileOperation.printAllElements(array);
        WhileOperation.printEverySecondElement(array);
        WhileOperation.printAllElementsReverse(array);
        System.out.println();
        ForOperation.printAllElements(array);
        ForOperation.printEverySecondElement(array);
        ForOperation.printAllElementsReverse(array);
        System.out.println();
        ForEachOperation.printAllElements(array);
        ForEachOperation.printEverySecondElement(array);
        ForEachOperation.printAllElementsReverse(array);
    }
}
