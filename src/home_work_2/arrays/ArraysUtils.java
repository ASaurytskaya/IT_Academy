package home_work_2.arrays;

import home_work_2.loops.NumberEntry;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraysUtils {

    public static int[] arrayFromConsole() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива (натуральное число):");
        String s = home_work_2.loops.NumberEntry.enterNaturalInteger(reader);
        int n = Integer.parseInt(s);
        int[] array = new int[n];

        System.out.println("Введите по очереди все элементы массива (целые числа):");
        for(int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(home_work_2.loops.NumberEntry.enterInteger(reader));
        }

        return array;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        if(size < 0) {
            System.out.println("Размер массива не может быть отрицательным.");
            return null;
        }
        if(size == 0) {
            return new int[0];
        }

        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
