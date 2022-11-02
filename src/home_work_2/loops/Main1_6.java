package home_work_2.loops;

public class Main1_6 {
    public static void main(String[] args) {

        String[] array = new String[80];
        for (int i = 0; i < 80; ) {
            for (int j = 2; j < 10; j++) {
                for (int k = 1; k < 11; k++) {
                    array[i] =  String.format("%d x %2d = %2d", j, k, j * k);
                    i++;
                }
            }
        }
        System.out.println("                       ТАБЛИЦА                   ");
        System.out.println("                      УМНОЖЕНИЯ                  ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s   %s   %s   %s\n", array[i], array[i+10], array[i+20], array[i+30]);
        }
        System.out.println();
        for (int i = 40; i < 50; i++) {
            System.out.printf("%s   %s   %s   %s\n", array[i], array[i+10], array[i+20], array[i+30]);
        }
    }
}
