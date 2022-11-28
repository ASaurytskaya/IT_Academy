package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4_6 {
    public static void main(String[] args) {
        int year;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите год:");
            year = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Неверно введено значение.");
            return;
        }
        if(isLeapYear(year)) {
            System.out.println("Високосный год.");
        } else {
            System.out.println("Невисокосный год.");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year % 100 == 0) {
            return year % 400 == 0;
        } else {
            return year % 4 == 0;
        }
    }
}
