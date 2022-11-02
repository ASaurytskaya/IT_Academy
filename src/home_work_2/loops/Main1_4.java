package home_work_2.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1_4 {
    public static void main(String[] args) {
        long a = 1;
        int b = 0;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите натуральное целое число больше 1:");
            String s  = NumberEntry.enterInteger(reader);
            b = Integer.parseInt(s);
        } catch(Exception ignore) {}
        long multiplication1 = a * b;
        long multiplication2 = multiplication1 * b;
        if(b == 2) {
            while(multiplication2 > multiplication1) {
                multiplication1 *= b;
                multiplication2 *= b;
            }
        } else if(b == -2) {
            while((multiplication2 > 0 && multiplication1 < 0) || (multiplication2 < 0 && multiplication1 > 0)) {
                multiplication1 *= b;
                multiplication2 *= b;
            }
        } else {
            while (multiplication2 % b == 0) {
                multiplication1 *= b;
                multiplication2 *= b;
            }
        }
        System.out.println("Число до переполнения    - " + multiplication1);
        System.out.println("Число после переполнения - " + multiplication2);
    }
}
