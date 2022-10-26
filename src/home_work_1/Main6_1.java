package home_work_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main6_1 {
    public static void main(String[] args) {
        String name = "";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите имя:");
            name = reader.readLine();
        } catch(Exception ignore) {
        }

        if(Objects.equals("Вася", name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал.");
        } else {
            if(Objects.equals("Анастасия", name)) {
                System.out.println("Я тебя так долго ждал.");
            } else {
                System.out.println("Добрый день, а вы кто?");
            }
        }
    }
}
