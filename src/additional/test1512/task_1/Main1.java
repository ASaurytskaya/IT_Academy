package additional.test1512.task_1;

public class Main1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 9;
        System.out.println(compareNumbers(a, b, c));
        System.out.println(calculateMean(a, b, c));
    }

    public static int compareNumbers(int a, int b, int c) {
        if(a > b && a > c) {
            return a + c;
        } else {
            return b;
        }
    }

    public static double calculateMean(int a, int b, int c) {
        double result = (a + b + c) / 3.0;
        return result;
    }
}
