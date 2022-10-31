package home_work_2.loops;

public class Main1_1 {
    public static void main(String[] args) {
        if(!args[0].matches("[0-9]+")) {
            if(args[0].matches("[0-9]+\\.[0-9]+")) {
                System.out.println("Ошибка: введено не целое число.");
            } else {
                System.out.println("Ошибка: введено не число.");
            }
            return;
        }
        int lastNumber = Integer.parseInt(args[0]);
        long result = 1L;
        for(int i = 1; i <= lastNumber; i++) {
            result = Math.multiplyExact(i, result);
        }
        System.out.println(result);
    }
}
