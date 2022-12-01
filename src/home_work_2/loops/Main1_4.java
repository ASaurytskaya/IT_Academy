package home_work_2.loops;

public class Main1_4 {

    public static String multiplyToOverflowAndPrint(int b) {
        if(b == 0) {
            return "При умножении на ноль переполнение невозможно.";
        }
        if(b == 1 || b == -1) {
            return "При умножении на единицу переполнение невозможно.";
        }
        long a = 1L;
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
        return String.format("Число до переполнения    - %s\nЧисло после переполнения - %s", multiplication1, multiplication2);
    }
}
