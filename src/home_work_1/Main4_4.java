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

        if(choice == 1) {
            System.out.printf("%d бит - это %.3f байт", number, toByte(number));
        } else {
            System.out.printf("%d бит - это %f килобайт", number, toKilobyte(number));
        }
    }

    public static double toByte(int a) {
        return a / 8.0;
    }

    public static double toKilobyte(int a) {
        return a / 8.0 / 1000;
    }
}
