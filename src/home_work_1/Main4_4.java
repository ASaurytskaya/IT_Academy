package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4_4 {
    public static void main(String[] args) {
        int number, choice;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число бит для перевода:");
            number = Integer.parseInt(reader.readLine());
            System.out.println("Для перевода в байты, нажмите 1; для перевода в килобайты, нажмите 2:");
            choice = Integer.parseInt(reader.readLine());
            while (choice != 1 && choice != 2) {
                System.out.println("Неверно введено значение. Повторите попытку.");
                System.out.println("Для перевода в байты, нажмите 1; для перевода в килобайты, нажмите 2:");
                choice = Integer.parseInt(reader.readLine());
            }
        } catch (Exception e) {
            System.out.println("Неверно введены значения.");
            return;
        }

        double result = number / 8.0;
        if(choice == 1) {
            System.out.printf("%d бит - это %.3f байт", number, result);
        } else {
            System.out.printf("%d бит - это %f килобайт", number, result / 1000);
        }

    }
}
