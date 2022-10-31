package home_work_2.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1_3 {
    public static void main(String[] args) {
        String n1 = "", n2 = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое число:");
            n1 = reader.readLine();
            while(!isNumber(n1)) {
                System.out.println("Ошибка: введено не число.");
                System.out.println("Введите первое число:");
                n1 = reader.readLine();
            }
            System.out.println("Введите второе число (целое, положительное):");
            n2 = reader.readLine();
            while(!isIntegerNumber(n2)) {
                if(!isNumber(n2)) {
                    System.out.println("Ошибка: введено не число.");
                } else {
                    System.out.println("Ошибка: введено не целое число.");
                }
                System.out.println("Введите второе число (целое, положительное):");
                n2 = reader.readLine();
            }
        } catch(Exception ignore) {}

        double numberOne = Double.parseDouble(n1);
        int numberTwo = Integer.parseInt(n2);
        double result = numberOne;
        if(numberTwo == 0) {
            result = 1;
        }
        for (int i = 1; i < numberTwo; i++) {
            result *=numberOne;
        }
        System.out.printf("%f ^ %d = %f", numberOne, numberTwo, result);
    }

    public static boolean isNumber(String s) {
       return(s.matches("[0-9]+") || s.matches("[0-9]+\\.[0-9]+"));
    }

    public static boolean isIntegerNumber(String s) {
        return s.matches("[0-9]+");
    }
}
