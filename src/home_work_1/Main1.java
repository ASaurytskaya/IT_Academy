package home_work_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) {
        int numberOne = 0, numberTwo = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое целое число:");
            numberOne = Integer.parseInt(reader.readLine()); //5
            System.out.println("Введите второе целое число:");
            numberTwo = Integer.parseInt(reader.readLine()); //9
        } catch(Exception e) {
            System.out.println("Неверно введены значения.");
            return;
        }
        int resultAnd = numberOne & numberTwo; //00000101 & 00001001 = 00000001
        int resultOr = numberOne | numberTwo; //00000101 & 00001001 = 00001101
        System.out.printf("Результат, полученный при использовании побитового И для чисел %d и %d, равен %d.\n",
                            numberOne, numberTwo, resultAnd);
        System.out.printf("Результат, полученный при использовании побитового ИЛИ для чисел %d и %d, равен %d.",
                numberOne, numberTwo, resultOr);
    }
}
/*
Побитовые операции не предназначены для вещественных чисел.
При записи команды "System.out.println(~42.5);" возникает ошибка "bad operand type double for unary operator '~'"
еще на этапе компиляции программы.
 */
