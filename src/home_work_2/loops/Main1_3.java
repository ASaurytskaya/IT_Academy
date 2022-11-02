package home_work_2.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1_3 {
    public static void main(String[] args) {
        String n1 = "", n2 = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое число:");
            n1 = NumberEntry.enterNumber(reader);
            System.out.println("Введите второе число (целое, положительное):");
            n2 = NumberEntry.enterPositiveInteger(reader);
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
}
