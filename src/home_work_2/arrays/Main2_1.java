package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class Main2_1 {
    public static void main(String[] args) {
        try {
            int[] container1 = ArraysUtils.arrayFromConsole();
            for (int i : container1) {
                System.out.println(i);
            }
        } catch(Exception ignore) {}

        int[] container2 = ArraysUtils.arrayRandom(5, 1000);
        for (int i : container2) {
            System.out.println(i);
        }
    }
}
