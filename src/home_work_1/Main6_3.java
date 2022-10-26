package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main6_3 {
    public static void main(String[] args) {
        String name = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите имя:");
            name = reader.readLine();
        } catch(Exception ignore) {
        }

        switch (name) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал.");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
