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

        if(year % 100 == 0) {
            if(year % 400 == 0) {
                System.out.println("Високосный год.");
            } else {
                System.out.println("Невисокосный год.");
            }
        } else {
            if(year % 4 == 0) {
                System.out.println("Високосный год.");
            } else {
                System.out.println("Невисокосный год.");
            }
        }
    }
}
