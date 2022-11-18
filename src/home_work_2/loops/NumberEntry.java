package home_work_2.loops;

import java.io.BufferedReader;

public class NumberEntry {
    public static boolean isNumber(String s) {
        return(s.matches("-?[0-9]+") || s.matches("-?[0-9]+\\.[0-9]+"));
    }

    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }

    public static boolean isPositiveInteger(String s) {
        return s.matches("[0-9]+");
    }

    public static String enterNumber(BufferedReader reader) throws Exception{
        String s = reader.readLine();
        while(!isNumber(s)) {
            System.out.println("Ошибка: введено не число.");
            System.out.println("Введите число:");
            s = reader.readLine();
        }
        return s;
    }

    public static String enterInteger(BufferedReader reader) throws Exception{
        String s = reader.readLine();
        while(!isInteger(s)) {
            if(!isNumber(s)) {
                System.out.println("Ошибка: введено не число.");
            } else {
                System.out.println("Ошибка: введено не целое число.");
            }
            System.out.println("Введите целое число:");
            s = reader.readLine();
        }
        return s;
    }

    public static String enterPositiveInteger(BufferedReader reader) throws Exception{
        String s = reader.readLine();
        while(!isPositiveInteger(s)) {
            if(!isNumber(s)) {
                System.out.println("Ошибка: введено не число.");
            } else if(!isInteger(s)){
                System.out.println("Ошибка: введено не целое число.");
            } else {
                System.out.println("Ошибка: введено отрицательное число.");
            }
            System.out.println("Введите целое положительное число:");
            s = reader.readLine();
        }
        return s;
    }

    public static String enterNaturalInteger(BufferedReader reader) throws Exception{
        String s = reader.readLine();
        while(!isPositiveInteger(s) || s.matches("0")) {
            if(!isNumber(s)) {
                System.out.println("Ошибка: введено не число.");
            } else if(!isInteger(s)){
                System.out.println("Ошибка: введено не целое число.");
            } else if (s.matches("0")){
                System.out.println("Ошибка: 0 не натуральное число.");
            } else {
                System.out.println("Ошибка: введено отрицательное число.");
            }
            System.out.println("Введите натуральное число:");
            s = reader.readLine();
        }
        return s;
    }
}
