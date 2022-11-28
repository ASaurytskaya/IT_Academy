package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4_2 {
    public static void main(String[] args) {
        int numberOne, numberTwo, numberThree;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите первое целое число:");
            numberOne = Integer.parseInt(reader.readLine());
            System.out.println("Введите второе целое число:");
            numberTwo = Integer.parseInt(reader.readLine());
            System.out.println("Введите третье целое число:");
            numberThree = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введены значения.");
            return;
        }

        if(numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree) {
            System.out.println("Введены неверные значения (повторяющиеся числа). Завершение работы программы.");
            return;
        }

        System.out.println(findAverageNumber(numberOne, numberTwo, numberThree));
    }

    public static int findAverageNumber(int numberOne, int numberTwo, int numberThree) {
        if((numberOne > numberTwo && numberOne < numberThree) || (numberOne > numberThree && numberOne < numberTwo)) {
            return (numberOne);
        } else if((numberTwo > numberOne && numberTwo < numberThree) || (numberTwo > numberThree && numberTwo < numberOne)) {
            return (numberTwo);
        } else {
            return (numberThree);
        }
    }
}
