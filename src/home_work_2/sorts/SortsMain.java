package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) throws Exception{
        sortAndPrint(new int[]{1,2,3,4,5,6});
        sortAndPrint(new int[]{1,1,1,1});
        sortAndPrint(new int[]{9,1,5,99,9,9});
        sortAndPrint(new int[]{});
        sortAndPrint(new int[]{6,5,4,3,2,1});
        sortAndPrint(ArraysUtils.arrayRandom(50, 100));
        sortAndPrint(ArraysUtils.arrayFromConsole());

        System.out.println();

        shakeAndPrint(new int[]{1,2,3,4,5,6});
        shakeAndPrint(new int[]{1,1,1,1});
        shakeAndPrint(new int[]{9,1,5,99,9,9});
        shakeAndPrint(new int[]{});
        shakeAndPrint(new int[]{6,5,4,3,2,1});
        shakeAndPrint(ArraysUtils.arrayRandom(50, 100));
        shakeAndPrint(ArraysUtils.arrayFromConsole());
    }

    private static void sortAndPrint(int[] array){
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив после сортировки");
        SortsUtils.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void shakeAndPrint(int[] array) {
        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(array));
        System.out.println("Массив после сортировки");
        SortsUtils.shake(array);
        System.out.println(Arrays.toString(array));;
    }
}
