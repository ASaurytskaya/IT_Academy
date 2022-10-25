package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4_3 {
    public static void main(String[] args) {
        int numberOne, numberTwo;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое целое число:");
            numberOne = Integer.parseInt(reader.readLine());
            System.out.println("Введите второе целое число:");
            numberTwo = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введены значения.");
            return;
        }

        int result = numberOne / numberTwo;
        int modulo = numberOne % numberTwo;
        if(modulo == 0) {
            System.out.printf("Число %d делится на число %d без остатка, частное равно %d.",
                    numberOne, numberTwo, result);
        } else {
            System.out.printf("Число %d не делится на число %d, частное равно %d, остаток равен %d.",
                    numberOne, numberTwo, result, modulo);
        }

    }
}
