package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4_5 {
    public static void main(String[] args) {
        int number;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число от 0 до 127:");
            number = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введены значения.");
            return;
        }

        if((number >= 65 && number <= 90) || (number >= 97 && number <= 122)) {
            System.out.println("Код " + number + " соответствует букве английского алфавита.");
        } else {
            System.out.println("Код " + number + " не соответствует букве английского алфавита.");
        }
    }
}
